def gitUrl = "https://github.com/c417-jenkins/${repo_name}.git"
def targetBranch = "master"

def setting
node {
    stage("checkout git") {
      dir("${WORKSPACE}") {
          git url: "${gitUrl}", branch: "${targetBranch}", credentialsId: "${ChocolateJenkins}"
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
        println("TODO: integration test")
      }
    }


    stage("deploy") {
      println("deploy delicious chocolate!!")
    }

}
