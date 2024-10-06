# Define variables
SRC_DIR = ./src/main
BUILD_DIR = ./build
CLASSES = $(wildcard $(SRC_DIR)/*/*.java)
MAIN_CLASS = solution.Main
NATIVE_IMAGE = native-image
EXECUTABLE_NAME = Main.main

# Default target
all: compile build run

# Compile Java source files
compile:
	mkdir -p $(BUILD_DIR)
	javac -d $(BUILD_DIR) $(CLASSES)

# Build native image
build: compile
	$(NATIVE_IMAGE) -o $(EXECUTABLE_NAME) --class-path $(BUILD_DIR) $(MAIN_CLASS)

#Build and run the native image
run: build
	./$(EXECUTABLE_NAME)

# Clean build artifacts
clean:
	rm -rf $(BUILD_DIR)/*
