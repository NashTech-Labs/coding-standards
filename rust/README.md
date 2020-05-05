# Rust-Coding-Standards
Rust is blazingly fast and memory-efficient: with no runtime or garbage collector, it can power performance-critical services, run on embedded devices, and easily integrate with other languages.

Rust’s rich type system and ownership model guarantee memory-safety and thread-safety — and enable you to eliminate many classes of bugs at compile-time.

To work with Rust programming efficiently we have to incorporate some tools like:

## Cargo:
Cargo is Rust’s build system and package manager. Most Rustaceans use this tool to manage their Rust projects because Cargo handles a lot of tasks for you, such as building your code, downloading the libraries your code depends on and building those libraries.

#### Cargo Installation:
The easiest way to get Cargo is to install the current stable release of Rust by using rustup. Installing Rust using rustup will also install cargo for you.

Command to install: 
```
$ curl https://sh.rustup.rs -sSf | sh
```

Cargo manages the creation, compilation, and execution of Rust Project by providing:
* cargo new
* cargo build 
* cargo check
* cargo run

#### Cargo new :
This command helps to create a Rust project.
```
$ cargo new project_name
```

#### Cargo build :
This command helps to compile the project and it also generates an executable in the target/debug directory.
```
$ cargo build 
```

#### Cargo check :
This is similar to cargo build command, the only difference is it’ll not generate an executable for you.
```
$ cargo check
```

#### Cargo run :
This command helps to run your project.
```
$ cargo run
```

This is all about the default command of Cargo and related to code quality, code coverage we some cargo plugin available in our crates.io.

### Note: Always use the latest version of the stable rust to get the updated features.


## Clippy:
A tool to improve code quality of the Rust Project. It is a collection of links to catch common mistakes and improve your Rust code.
It is recommended not to include Clippy as a hard dependency means always use clippy as a cargo subcommand.
To incorporate Clippy you should have at least Stable Rust 1.29  installed. Or try to use the latest version of Rust stable to get the updated features. 

Install it by using:
```
$ rustup component add clippy
```

Or if it says that it can't find the clippy component, please run `rustup self update`.

Now clippy is installed and you can run the clippy by running:
```
$ cargo clippy
```

## Tarpaulin:
A tool for compiling unit test coverage for cargo. It is a command-line program you can install it by using cargo install.

Installation:
```
$ cargo install cargo-tarpaulin
```

Check code coverage using:
```
$ cargo tarpaulin -v 
```


