lazy val moduleName = "drt-londoncity-airport-schema"

lazy val cxfVersion: String = "3.2.4"
lazy val specs2 = "3.7"

lazy val project = Project(id = moduleName, base = file("."))
  .settings(
    name := moduleName,
    version := "1.0.0",
    organization := "uk.gov.homeoffice",
    scalaVersion := "2.12.8",
    scalacOptions ++= Seq(
      "-feature",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:reflectiveCalls",
      "-language:postfixOps",
      "-Yrangepos",
      "-Yrepl-sync"
    ),
    fork in run := true,
    fork in test := true,
    // parallelExecution in Test := true,
    ivyScala := ivyScala.value map {
      _.copy(overrideScalaVersion = true)
    },
    // CXF wsdl2java configuration
    Seq(cxf.settings: _*),
    cxf.cxfVersion := cxfVersion,
    cxf.wsdls := Seq(
      cxf.Wsdl((resourceDirectory in Compile).value / "RequestFlightServiceSingle.wsdl",
        Seq("-mark-generated"), "RequestFlightService")
    ),
    resolvers ++= Seq(
      "Artifactory Snapshot Realm" at "https://artifactory.digital.homeoffice.gov.uk/artifactory/libs-snapshot/",
      "Artifactory Release Realm" at "https://artifactory.digital.homeoffice.gov.uk/artifactory/libs-release/",
      "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
    )

  )
  .settings(libraryDependencies ++= {
    Seq(
      "org.specs2" %% "specs2-core" % "3.8.9" % Test,
      "org.specs2" %% "specs2-junit" % "3.8.9" % Test,
      "org.specs2" %% "specs2-mock" % "3.8.9" % Test,
      "org.specs2" %% "specs2-scalacheck" % "3.8.9" % Test
    )
  }

  )

fork in run := true

publishTo := {
  val artifactory = "https://artifactory.digital.homeoffice.gov.uk/"

  if (isSnapshot.value)
    Some("snapshot" at artifactory + "artifactory/libs-snapshot-local")
  else
    Some("release" at artifactory + "artifactory/libs-release-local")
}

//credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

// Enable publishing the jar produced by `test:package`
publishArtifact in(Test, packageBin) := true

// Enable publishing the test API jar
publishArtifact in(Test, packageDoc) := true

// Enable publishing the test sources jar
publishArtifact in(Test, packageSrc) := true
