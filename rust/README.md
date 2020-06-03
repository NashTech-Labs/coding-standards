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
Clippy is configurable, you can create your own custom TOML file for Clippy called as [`clippy.toml`](clippy.toml) and place it into your project directory beside your cargo.toml.


## Rustfmt
A tool for formatting Rust code according to style guidelines. Rustfmt automatically formats your code base whenever it get triggered.

Installation:
```
$ rustup component add rustfmt
```

Format your code as per style guidelines:
```
$ cargo fmt
```

Rustfmt is configurable, you can create your own custom TOML file for Rustfmt called as [`rustfmt.toml`](rustfmt.toml) and place it into your project directory beside your cargo.toml.

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
To get the report for the coverage:
```
$ cargo tarpaulin --out Xml
```
This command generates a `cobertura.xml` file that is compatible with CodeSquad. To upload the report in CodeSquad you can refer [`this`](https://www.getcodesquad.com/dashboard/help). 

## Key points to remember

### Naming Conventions
* Local variables should be snake_case,
* Function and method names should be snake_case,
* Constants should be SCREAMING_SNAKE_CASE.
* Enum variants should be UpperCamelCase,
* Types should be UpperCamelCase,
* Struct fields should be snake_case,
* Macro names should be snake_case,
* In case of reserved word, use a trailing underscore to make the name legal (example: struct_)

### Rules of a Good Function
* Function must return a value,
* Function should always have a single responsibility,
* Block of statements must be concise,
* Name of the function should be reasonable

### Formatting Rules
Although we have Rustmst to format our code, but there are some points that need to have incorporated while coding.
* Use spaces around keywords and before the opening brace, no spaces around the semi-colon.
* There should be spaces after the `:` and on both sides of the `=` (if they are present). 
  For example: 
  ```
  let varialbe_name;
  let varialbe_name: Type;
  let varialbe_name = value;
  ```
* Declaration/Definition Formattings
  * Method declaration
    ```
    // The proper ordering and spacing is:
    [pub] [unsafe] [extern ["ABI"]] fn foo(arg1: i32, arg2: i32) -> i32 {
      //do something
    }
    
    // If any fucntion gois out of line, then break after the opening parenthesis and before the closing parenthesis and put each argument on its own block-indented line.
    Like this:
    fn foo(
    arg1: i32,
    arg2: i32, // Note the trailing comma on the last argument.
    ) -> i32 {
        // do something
    }
    ```
  * Structs/Enums/Tuples
    ```
    // Define each type with the opening brace on the same line when it fits within the right margin.
    // All struct fields are indented once and end with a trailing comma.
    For example (It applies to all types): 
    struct Foo {
        first: Type,
        second: Type,
    }
    
    // If you have type varient with less numner of arguments and they can be fitted on the same line then. Then are is no need to use trailing commna.
    Like:
    enum FooBar {
        Error { err: Box<Error>, line: u32 },
    }
    // And like this:
    pub struct Foo(String, u8);
    
    * Note: Prefer unit type to empty tuple type 
    For example: 
    struct Foo; // Instead of `struct Foo();` or `struct Foo {}`
    ```
  
  * Imports Ordering
    ```
    // If an import can be formatted on one line, do so. There should be no spaces around braces.
    // A group of imports is a set of imports on the same or sequential lines. One or more blank lines or other items (e.g., a function) separate groups of imports.
    // Within a group of imports, imports must be sorted ascii-betically. Groups of imports must not be merged or re-ordered.

    For example:
    use c;
    use d;

    use a;
    use b;

    use xyz::abc::{foo, bar};

    // In case of large imports, there should be trailing comma
    bar::{
        a, b, c, d, e,
        f, 
    };
    ``` 
  * Block expressions
    ```
    // Block expression should have a newline after the initial `{` and before the terminal `}`. 
    // The contents of the block should be block indented
    For example:
    fn block_emaple() {
        function();
        
        unsafe {   // qualifier should always be on the same line as the opening brace, and separated with a single space
            function();
        }
    }
    
    // Block with attribute
    fn block_as_stmt() {
        #[attribute] //  it should be on its own line
        {
            #![inner_attribute] //  it should be on its own line
            
            // use comments on its own line, avoid writing comments on same line
            any_operation
        }
    }
    ```
    * Try to avoid writing comments on same line,
    * Empty block should be written as `{}`,
    * A block can be written on a single line if it has no comments and has single-line expression and no statements
      ```
      For Example:
      let _ = { a_call() };
      ```
  * Closures
    ```
    // Do not put extra space before `|` and put space between second `|` and expression
    |arg1, arg2| expr
    
    // Put extra space berfore `|` if the closure is prefixed by move
    // And include `{}` only if it contains statments
    move |arg1: i32, arg2: i32| -> i32 {
        return_statement
    }
    ```
  * Arrays/Indexing/Slicing
    * Don't use spaces around the square brackets,
    * In case of multiple lines it should be block indented and there should be newlines after the opening brackets and before the closing bracket,
    * Always break line after opening bracket
    ```
    array[index];
    long_target[
        long_indexing_expression
    ];
    ```
  * Function calling
    * Use space between the function name, and the opening parenthesis.

    * Don't use space between an argument, and the comma which follows.

    * Use space between an argument, and the comma which precedes it.
    ```
    // Do not put a comma after the last argument.
    function_name(arg1, arg2);
    
    // In case of multiple arguments each argument should be in its own line with trailing comma.
    function_name(
      arg1,
      arg2,
      arg3,
    );
    ```
  * Control flow 
    ```
    // Block formatting should apply on all control flows
    
    //  Do not include parentheses for `if` and `while` expressions.
    if condition {
    }
    
    // If there is requirement for break control flow in multiple line then always prefer:
    // Break before `=` in `* let` expressions and before `in` in  `for` expression
    For Example:
    while let Some(bar)
        = long_expression
    {
        // do something
    }

    for foo
        in long_expression
    {
        // do something
    }
    ```
  * Match
    * Match arms must be block indented,
    * Use a trailing comma for a match arm if and only if not using a block,
    * Never start a match arm pattern with `|`,
    * There must always be a line break after opening brace and before closing brace.
    ```
    match data {
        arm1 => bar,
        arm_x | arm_y if an_expression() => {
            an_expression()
        }
        amr2 => {
            // A comment.
            an_expression()
        }
        arm3 => {
            let a = statement();
            an_expression()
        }
        arm4 => {}
        // Trailing comma on last item.
        foo => bar,
    }
    ```
  * Ranges
    * Don't put spaces in ranges,
    * In case of line break, break before the range operator and block indent the second line.
    * In case of expressions in ranges use paranthesis
    ```
    // General scenaio
    0..10, x..=y
    
    // Multi-line range
    ong_expression
      ..another_long_expression // break before range operator
    
    // In case of expressions
    a..(a + b)
    ```
* File structure
  * `extern crate` statements must be first in a file. They must be ordered alphabetically.
  * `use` statements should come after `extern`.
  * Module declaration should come after `use` statements.
  * Imports and modules should be ordered alphabetically.
  * `self` and `super` must come before any other names.

* Cargo.toml
  * Always put a blank line between the last key-value pair in a section and the header of the next section,
  * Do not place a blank line between section headers and the key-value pairs in that section, or between key-value pairs in a section.
  * Sort key names alphabetically within each section
  * Put [package] section at the top of the file,
    * Put the `name` and `version` keys in that order at the top of that section,
    * Followed by remaining keys alphabetical order,
    * Followed by description at the end of that section.
  * Put a single space both before and after the `=` between a key and value,
  * Do not indent any key names, 
  * Don't use quotes around any standard key names,
  * Start all key names at the start of a line,
  * In case of array values use block indentation:(if it doesn't fits on the same line)
    ```
    hosts = [
      "abc",
      "xyz"
    ]
    ```
  * Tables items should be in the same line inside the curly braces,
  * In case of large table items, sperate them in a new section key-value pairs 
    ```
    // General scenario
    [dependencies]
    crate_name = { version = "0.0.1", default-features = false, features = ["fearure_name"] }

    // In case of large table items
    [dependencies.long_crate_name]
    version = "0.0.1"
    default-features = false
    features = ["fearure_name"]
    ```

