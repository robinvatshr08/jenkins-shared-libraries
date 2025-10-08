def call(String projectname,String Tag,String dockerhubuser){
 sh "docker build -t ${projectname}:${tag} ." 
}
