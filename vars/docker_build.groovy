def call(String projectname,String tag,String dockerhubuser){
 sh "docker build -t ${dockerhubuser}/${projectname}:${tag} ." 
}
