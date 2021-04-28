pipeline {
    agent any
    
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven"
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
         stage('GIT Clone Phase') {
            steps {
                git 'https://github.com/learningnuts/maven'
            }
        }
        
        stage('Maven Clean Phase') {
            steps {
                bat 'mvn clean'
            }
        }
        
        stage('Maven Compile Phase') {
            steps {
                bat 'mvn clean compile'
            }
        }
        
        stage('Maven install Phase') {
            steps {
                bat 'mvn clean install'
            }
        }
        
                stage('Deploy through Jenkins') {
            steps {
               nexusPublisher nexusInstanceId: 'nexus', nexusRepositoryId: 'hclrelease', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: 'C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\pipeline_maven_package_jenkins_deploy\\target\\project4-1.0.6.jar']], mavenCoordinate: [artifactId: 'project4', groupId: 'com.hcl', packaging: 'jar', version: '1.6']]]
            }
        }
    }
}



Nexus platfarm plugin to be installed