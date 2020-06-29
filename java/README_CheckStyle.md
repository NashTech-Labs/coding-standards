# CheckStyle Rules

##### Condition1. 
* Type - Static Imports
* Guide - Avoid Static Imports
* Rationale - Importing static members can lead to naming conflicts between class' members. It may lead to poor code readability since it may no longer be clear what class a member resides in (without looking at the import statement).

##### Condition2.
* Type - Import Order
* Guide - Maintain import order
* Rationale - Group normal imports and static imports. Static imports should come after normal imports.

##### Condition3.
* Type - Empty Line
* Guide - Each statement is followed by a line break.
* Rationale - Makes code more readable.

##### Condition4.
* Type - Line length
* Guide - Each line should have maximum 100 characters
* Rationale - Makes code more readable and one does not have to scroll left or right on the screen.

##### Condition5.
* Type - Multiple Variable Declaration
* Guide - One variable per declaration
* Rationale - Declarations should be one per line/statement.

##### Condition6.
* Type - JavadocMissingWhitespaceAfterAsterisk
* Guide - Comments
* Rationale - Although spaces after asterisks are optional in the Javadoc comments, their absence makes the documentation difficult to read. 

##### Condition7.
* Type - MissingOverride
* Guide - Always use @Override
* Rationale - Coding best practices

##### Condition8.
* Type - NewlineAtEndOfFile
* Guide - Checks whether files end with a new line
* Rationale - Coding best practices/Code looks readable.

##### Condition9.
* Type - ConstantName, LocalFinalVariableName, LocalVariableName, MultipleVariableDeclarations, MemberName, MethodName, PackageName, ParameterName, StaticVariableName, TypeName
* Guide - Naming conventions
* Rationale - The name should follow the conventions and standards

##### Condition10.
* Type - AvoidStarImport
* Guide - Imports in class file.
* Rationale - Best practices/Coding standards

##### Condition11.
* Type - MethodLength
* Guide - Should be maximum 30 lines.
* Rationale - Best practices/Coding standards

##### Condition12.
* Type - ParameterNumber
* Guide - Should be maximum 14.
* Rationale - Best practices/Coding standards

##### Condition13.
* Type - ModifierOrder
* Guide - Should be in order.
* Rationale - Best practices/Coding standards

##### Condition14.
* Type - EmptyBlock
* Guide - No empty block for try, if & else and other.
* Rationale - Best practices/Coding standards

##### Condition15.
* Type - NeedBraces
* Guide - Braces for if & else, even if there is a single statement.
* Rationale - Makes code more readable.

##### Condition16.
* Type - MagicNumber
* Guide - Numbers should be avoided.
* Rationale - Best practices/Coding standards, use constants instead.

##### Condition17.
* Type - MissingSwitchDefault
* Guide - Default section should always be there.
* Rationale - If no case matches, there should be a fallback.

##### Condition18.
* Type - ArrayTypeStyle
* Guide - Checks the style of array type definitions.
* Rationale - Best practices/Coding standards.

##### Condition19.
* Type - FinalParameters
* Guide - Parameter should be final.
* Rationale - To avoid mutation of the variable.

##### Condition20.
* Type - UniqueProperties
* Guide - Detects duplicated keys in properties files.
* Rationale - Multiple property keys usually appear after merge or rebase of several branches. While there are no problems in runtime, there can be a confusion due to having different values for the duplicated properties.
