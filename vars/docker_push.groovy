def call(String projectName, String tag, String dockerHubUser) {
    withCredentials([usernamePassword(
        credentialsId: 'dockerhub-token',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {
        // Login securely using stdin
        sh """
            echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
            docker push \$DOCKER_USER/${projectName}:${tag}
            docker logout
        """
    }
}
