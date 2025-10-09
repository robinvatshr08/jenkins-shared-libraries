def call(String projectname,String tag,String dockerhubuser){
  withCredentials([usernamePassword(
             credentialsId:"dockerhub-token",
             passwordVariable:"dockerHubPass",
             usernameVariable:"dockerHubUser")]){
                 sh " docker login -u ${dockerhubuser} -p ${dockerHubPass} "                
             }
               sh "docker push ${dockerHubUser}/${projectname}:${tag} "
}
