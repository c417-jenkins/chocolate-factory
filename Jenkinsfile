def gitUrl = "https://github.com/c417-jenkins/chocolate-factory.git"
def targetBranch = "master"

def contentType = "application/json"
def postUrl = "http://localhost:8081/c417-factory/api/chocolate"

def setting
node {
    stage("checkout git") {
      dir("${WORKSPACE}") {
          git url: "${gitUrl}", branch: "${targetBranch}"
          sh "ls -la"
      }
    }

    stage("Lint") {
      dir("${WORKSPACE}") {
        println("TODO: Add lint")
      }
    }

    stage("Unit Test") {
      dir("${WORKSPACE}") {
        withMaven( maven: "M3") {
          sh "mvn test"
        }
      }
    }

    stage("build") {
      dir("${WORKSPACE}") {
        withMaven( maven: "M3") {
          sh "mvn install"
        }
      }
    }

    stage("Integration Test") {
      dir("${WORKSPACE}") {
        println("TODO: curl")
      }
    }


    stage("deploy") {
      println("see you")
    }

}
