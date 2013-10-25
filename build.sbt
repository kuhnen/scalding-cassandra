
scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation")

resolvers += "conjars.org" at "http://conjars.org/repo"

val cascadingVersion = "2.0.7"

val cassandraVersion = "1.2.10"

val scaldingVersion = "0.8.3"

val hectorVersion = "1.1-4"

libraryDependencies += "me.prettyprint" % "hector-core" % "1.0-5"
            
libraryDependencies += "cascading" % "cascading-core" % cascadingVersion

libraryDependencies += "org.hectorclient" % "hector" % hectorVersion
  
libraryDependencies += "com.twitter" % "scalding_2.9.2" % scaldingVersion
                      
//libraryDependencies += "com.twitter" % "scalding-core_2.10" % "0.9.0rc1"

libraryDependencies += "cascading" % "cascading-hadoop" % cascadingVersion

libraryDependencies += "cascading" % "cascading-local" % cascadingVersion

libraryDependencies += "org.apache.cassandra" % "cassandra-all" % cassandraVersion


            

            


