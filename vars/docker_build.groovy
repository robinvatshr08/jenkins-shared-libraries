def call(String projectname,String Tag,String dockerhubuser){
 sh "docker build -t ${dockerhubuser}/ ${projectname}:${tag} ." 
}
