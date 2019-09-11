pipeline {
	environment {
   	 registry = "maulikjpatel1993/spring-boot-docker-jenkins:latest"
   	 registryCredential = 'docker'
   	 dockerImage = ''
  	}	
    agent any
    stages {
       stage('Building Docker Image') {
	      steps{
	      	echo 'Starting to build docker image'
	       	 script {
	         	  def customImage = docker.build("my-image:${env.BUILD_ID}")
                  customImage.push()
	        }
	      }
    	}
    }
}