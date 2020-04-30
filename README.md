# Vision of this Repository

Identify and define the configurations for all SCA tooling that we use at Knoldus for delivering very high Quality software

The plugin configuration would be defined for the following
- Scala
- Java
- Rust
- Go
- Angular
- React

## Process
We would start with standard industry wide adopted configurations and then make them tighter as per the quality requirements defined at Knoldus

### For example
- The checkstyle standard configuration for method length is 60
` <module name="MethodLength">
   <property name="tokens" value="METHOD_DEF"/>
   <property name="max" value="60"/>
 </module>`
 
 but for the Knoldus standard we keep it as 25
 ` <module name="MethodLength">
   <property name="tokens" value="METHOD_DEF"/>
   <property name="max" value="25"/>
 </module>`
