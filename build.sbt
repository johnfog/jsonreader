name := "json_exporter_tumanov"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++=Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.2.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.4.7" % Provided,
  "org.json4s" %% "json4s-jackson" % "3.6.10"
)

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.7"