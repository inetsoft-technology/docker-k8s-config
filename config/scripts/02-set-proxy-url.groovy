/**
 * Sets the proxy URL if required.
 */
inetsoft {
   String stagingDir = commandLine[2]
   path "$stagingDir/config"

   String proxyUrl = System.getenv("INETSOFT_INTEGRATION_PROXY")

   if(proxyUrl != null && !proxyUrl.empty) {
      Properties sreeProps = new Properties()
      File propsFile = new File("$stagingDir/config/sree.properties")
      propsFile.withInputStream { sreeProps.load(it) }
      sreeProps.setProperty('replet.repository.servlet', proxyUrl)
      propsFile.withOutputStream { sreeProps.store(it, null) }
   }
}