pipeline {
	agent any
		
	environment {
		tagnumber = "${env.BUILD_NUMBER}"
	}
	
	stages{
	
     stage("Cleaning Stage") {
      steps {
        bat "mvn clean"
      }
    }
    stage("Testing stage") {
      steps {
        bat "mvn test"
      }
    }
    stage("Packaging stage") {
      steps {
        bat "mvn package"
      }
    }
     stage("Sonar stage") {
      steps {
        bat "mvn package sonar:sonar"
      }
    }
 
	stage('Docker_image_build') {
		steps {
		  bat 'docker build -t vishwavk2021/docker:tagnumber .'

		}
	}
	
	}
}
