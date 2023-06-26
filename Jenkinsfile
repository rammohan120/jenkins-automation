pipeline {
    agent any
    tools{
        maven 'Maven-3.9.2'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rammohan120/jenkins-automation']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t rammohanp888/devops-integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pw', variable: 'dockerhubpwd')]) {
                   sh 'docker login -u rammohanp888 -p ${dockerhubpwd}'

}
                   sh 'docker push rammohanp888/devops-integration'
                }
            }
        }

    }
}
