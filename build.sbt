name := "nzmvc"

version := "0.0.1"

scalaVersion := "2.11.1"

libraryDependencies += "org.eclipse.jetty" % "jetty-server" % "9.1.5.v20140505"

libraryDependencies += "org.eclipse.jetty" % "jetty-servlet" % "9.1.5.v20140505"

libraryDependencies += "com.google.inject.extensions" % "guice-servlet" % "3.0"

libraryDependencies += "com.google.inject" % "guice" % "3.0"

libraryDependencies += "org.reflections" % "reflections" % "0.9.9-RC1"


// tests

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.7" % "test"