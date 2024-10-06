# Define variables
SRC_DIR = ./src/main
BUILD_DIR = ./build
CLASSES = $(wildcard $(SRC_DIR)/*/*.java)
MAIN_CLASS = solution.Main
NATIVE_IMAGE = native-image
JAR_NAME = Basics.jar
EXECUTABLE_NAME = Main.main

# Default target
all: target-jar

# Jar target
target-jar: pack-jar

# Native target
target-native: compile build

# Compile Java source files
compile:
	mkdir -p $(BUILD_DIR)
	javac -d $(BUILD_DIR) $(CLASSES)

# Build Jar file
pack-jar:
	jar cfe $(JAR_NAME) $(MAIN_CLASS) -C $(BUILD_DIR) .

# Build native image from class files
build-native: compile
	$(NATIVE_IMAGE) -o $(EXECUTABLE_NAME) --class-path $(BUILD_DIR) $(MAIN_CLASS)

# Run the native image
run-native: build-native
	./$(EXECUTABLE_NAME)

# Run the Jar
run-jar: pack-jar
	java -jar $(JAR_NAME)

# Clean build artifacts
clean:
	rm -rf $(BUILD_DIR)/*
	rm -f $(JAR_NAME)
	rm -f myExecutableName
