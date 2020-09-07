# PMD Rules

##### Condition1. 
* Type - CodeStyle
* Guide - Rules which enforce a specific coding style.
* Rules Enforced - 
1. AvoidDollarSigns: Avoid using dollar signs in variable/method/class/interface names.
2. AvoidProtectedFieldInFinalClass: Do not use protected fields in final classes since they cannot be subclassed.
3. AvoidProtectedMethodInFinalClassNotExtending: Do not use protected methods in most final classes since they cannot be subclassed.
4. AvoidUsingNativeCode: Unnecessary reliance on Java Native Interface (JNI) calls directly.
5. BooleanGetMethodName: Methods that return boolean results should be named as predicate statements.
6. ClassNamingConventions: Configurable naming conventions for type declarations.
7. ExtendsObject: No need to explicitly extend Object.
8. FieldDeclarationsShouldBeAtStartOfClass: Fields should be declared at the top of the class, before any method declarations, constructors etc.
9. LongVariable: Fields, formal arguments, or local variable names that are too long can make the code difficult to read.
10. MethodArgumentCouldBeFinal: A method argument that is never re-assigned within the method can be declared final.
11. PrematureDeclaration: Checks for variables that are defined before they might be used.
12. ShortMethodName: Method names that are very short are not helpful to the reader.
13. TooManyStaticImports: If you overuse the static import feature, it can make your program unreadable and unmaintainable.
14. UnnecessaryCast: This rule detects when a cast is unnecessary while accessing collection elements.
15. UnnecessaryModifier: Fields in interfaces and annotations are automatically ‘public static final’.
16. UseDiamondOperator: Use the diamond operator to let the type be inferred automatically.
17. UselessParentheses: Useless parentheses should be removed.



##### Condition2.
* Type - Multithreading
* Guide - Rules that flag issues when dealing with multiple threads of execution.
* Rationale - 
1. AvoidSynchronizedAtMethodLevel: Method-level synchronization can cause problems when new code is added to the method.
2. AvoidUsingVolatile: Use of the keyword ‘volatile’ is generally used to fine tune a Java application.
3. DoubleCheckedLocking: Partially created objects can be returned by the Double Checked Locking pattern when used in Java.
4. NonThreadSafeSingleton: Non-thread safe singletons can result in bad state changes.
5. UseNotifyAllInsteadOfNotify: Thread.notify() awakens a thread monitoring the object.


##### Condition3.
* Type - Error Prone
* Guide - Rules to detect constructs that are either broken, extremely confusing or prone to runtime errors.
* Rationale -
1. AssignmentInOperand: Avoid assignments in operands; this can make code more complicated and harder to read.
2. AvoidCallingFinalize: The method Object.finalize() is called by the garbage collector on an object.
3. AvoidCatchingNPE: Code should never throw NullPointerExceptions under normal circumstances.
4. AvoidCatchingThrowable: Catching Throwable errors is not recommended since its scope is very broad.
5. DoNotThrowExceptionInFinally: Throwing exceptions within a ‘finally’ block is confusing since they may mask other exceptions.
6. EmptyCatchBlock: Empty Catch Block finds instances where an exception is caught, but nothing is done.
7. EmptyFinallyBlock: Empty finally blocks serve no purpose and should be removed.
8. EmptySwitchStatements: Empty switch statements serve no purpose and should be removed.
9. EmptySynchronizedBlock: Empty synchronized blocks serve no purpose and should be removed.
10. EmptyTryBlock: Avoid empty try blocks - what’s the point?


##### Condition4.
* Type - Design
* Guide - Rules that help you discover design issues.
* Rationale - 
1. AbstractClassWithoutAnyMethod: If an abstract class does not provides any methods, it may be acting as a simple data container.
2. AvoidCatchingGenericException: Avoid catching generic exceptions such as NullPointerException, RuntimeException, Exception.
3. CyclomaticComplexity: The complexity of methods directly affects maintenance costs and readability.
4. ExcessiveClassLength: Excessive class file lengths are usually indications that the class may be burdened with excessive code.
5. ExcessiveMethodLength: When methods are excessively long this usually indicates that the method is doing more than required.
6. SimplifyBooleanExpressions: Avoid unnecessary comparisons in boolean expressions, they serve no purpose and impacts readability.
7. SimplifyBooleanReturns: Avoid unnecessary if-then-else statements when returning a boolean.
8. TooManyMethods: A class with too many methods is probably a good suspect for refactoring.
9. UselessOverridingMethod: The overriding method merely calls the same method defined in a superclass.
10. UseUtilityClass: For classes that only have static methods, consider making them utility classes.

##### Condition5.
* Type - Documentation
* Guide - Rules that are related to code documentation.
* Rationale - 
1. UncommentedEmptyConstructor: Uncommented Empty Constructor finds instances where a constructor does not contain statements.
2. UncommentedEmptyMethodBody: Uncommented Empty Method Body finds instances where a method body does not contain statements.
