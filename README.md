# File Manager Specification

- [Background](#background)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)

## Background

When building applications that need to manage files and directories, it is often useful to have a unified interface that can be used for different file systems. The File Manager Specification project provides such an interface, with methods for creating, deleting, moving, copying, downloading, renaming, finding, sorting, and filtering files within one root directory.

## Features

- Defines an interface with methods for managing directories and files within one root directory
- Includes methods for creating, deleting, moving, copying, downloading, renaming, finding, sorting, and filtering files
- Demonstrates Separating The Specification And Implementations, allowing for multiple implementations of the interface for different use cases
- Two implementations, one for local files and another for Google Drive, are included as separate projects

## Installation

To use File Manager Specification in your own projects, simply include the `Specification.java` file in your project and implement the methods of the interface. Alternatively, you can use one of the provided implementations, Local File Manager Implementation or Google Drive File Manager Implementation.

## Usage

To use File Manager Specification, first define a class that implements the `Specification` interface. Then, implement the methods of the interface to provide the desired file management functionality. Or you can simply add this project as a dependency in your project and implement the methods of the interface. You can use the provided implementations, Local File Manager Implementation or Google Drive File Manager Implementation, as examples of how to implement the interface.

