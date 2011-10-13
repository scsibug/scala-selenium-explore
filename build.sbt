name := "scala-webtest-api"

organization := "com.gregheartsfield"

version := "0.1"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  "Scala-Tools Nexus Repository for Releases" at "http://nexus.scala-tools.org/content/repositories/releases",
  "Scala-Tools Maven Repository" at "http://www.scala-tools.org/repo-releases/"
)

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.7.0",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)
