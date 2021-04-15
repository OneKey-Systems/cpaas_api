# onekey-zang-java
Fork of [zang-java](https://github.com/zang-cloud/zang-java) from Avaya. Forked at version 1.1.0. 

# About
This is a helper library used to interact with Avaya's CPaaS services. It takes
away all the boilerplate and pain that come from having to make HTTP requests yourself
in order to make calls or send text messages.

# Installation
## Local installation
Clone the repository locally and run `mvn install` this will compile the project,
run unit-tests and install it to your local repository. Once this is done
you can import it in your `pom.xml` like any other dependency.

## From Maven repository
We have yet to upload the library to the maven repository. We are working on it and as soon as it
is online we will update this section. 

# Documentation
You can find official documentation on Avaya's REST API and InboundXML documents on
their website.

To see examples of 'real world' applications interacting with this library you can
check out some of the repositories on this organization.

As of version 2.0.0 we have uploaded this library's javadocs online. You can
check them out here:

https://dev.onekey.mx/apidocs/index.html

Most if not all the documentation present is the original documentation. No comments
of our own have been added. If possible we will try to write any pertinent missing
documentation, and we will always fully document any addition we make.

# Versioning
We use [semantic versioning](https://semver.org/). We can't guarantee versions
previous to 1.1.0 actually follow it (we did not code them), but going forward
we will ensure the project follows semantic versioning.

# Collaborating
We would be glad to have you collaborate. Just fork the project and 
make a pull request against our `develop` branch. If you add any extra functionality
please make sure to document and test it.