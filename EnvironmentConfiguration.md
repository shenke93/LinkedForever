##Environment Configuration

### Background
For the convenience of our teamwork, we need to have a common and standard working environment. 
We also need to simplify our potential users to install the product and configure the running environment. 
After comparing some possible solutions, I recommend you to use **gradle** to manage our project.

### 1. Introduction of Gradle 
To avoid writing complex build.xml for ANT and pom.xml for Maven, and also to get rid of terrible inexplicit dependency 
problems, I suggest we use the more user-friendly build automation system **gradle**.

Here is a quick tutorial of 15 minutes about [Building Java Projects with Gradle](https://spring.io/guides/gs/gradle/).
It is one of the Spring Getting Started Content. Please read this tutorial before you continue.

### 2. Eclipse Gradle Support
A quick way to install the Gradle tooling for Eclipse is using the Eclipse Marketplace client.
You can find the plugin **Builship Gradle Gntegration 2.0** whose logo is a cute black elephant.
You can follow the first few steps in this tutorial:
[Using the Gradle build system in the Eclipse IDE](http://www.vogella.com/tutorials/EclipseGradle/article.html).

After you have successfully installed the gradle plugin, it is recommended to to create a new gradle project (Step 3 in the above totorial).

### 3. Use Spring Framework
It's quite easy to configure the working environment now.
You can find **build.gradle** on the root of your project. Change the content of **dependencies**:
~~~
dependencies {
    // The production code uses Guava
    compile 'com.google.guava:guava:20.0'

    // Use JUnit test framework
    testCompile 'junit:junit:4.12'
    
    // Use Spring Framework
    compile 'org.springframework:spring-context:4.3.5.RELEASE'
    
    // Use Spring Test Modules if you need unit tests
    testCompile("org.springframework:spring-test:4.3.6.RELEASE")
}
~~~
You can find more information on 
[Introduction to the Spring Framework](http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/overview.html#overview-modules).

Eclipse does currently not automatically update the classpath if the build.gradle file is updated. 
**Select Gradle ▸ Refresh Gradle Project** from the context menu of the project or from your build.gradle file for that.

##### Be Happy With Spring Framework and Project now!:)
    
