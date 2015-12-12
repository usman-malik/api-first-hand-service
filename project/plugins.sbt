resolvers += Resolver.url("sbt-plugins", url("http://dl.bintray.com/zalando/sbt-plugins"))(Resolver.ivyStylePatterns)

resolvers += Resolver.bintrayRepo("slavaschmidt","maven")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.3")

addSbtPlugin("de.zalando" % "sbt-play-swagger" % "0.1.1")

