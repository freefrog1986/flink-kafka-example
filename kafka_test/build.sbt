name := "kafka_test"

version := "0.1"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/org.apache.flink/flink-scala
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.6.1" % "compile"

// https://mvnrepository.com/artifact/org.apache.flink/flink-streaming-scala
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.6.1" % "compile"

// https://mvnrepository.com/artifact/org.apache.flink/flink-clients
libraryDependencies += "org.apache.flink" %% "flink-clients" % "1.6.1" % "compile"

// https://mvnrepository.com/artifact/org.apache.flink/flink-connector-kafka-0.10
libraryDependencies += "org.apache.flink" %% "flink-connector-kafka-0.10" % "1.6.1" % "compile"