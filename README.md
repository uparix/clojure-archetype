# Clojure Bundle Maven Archetype

This Maven Archetype creates and builds a clojure project only using maven build steps.

## Software Stack

- Clojure 1.10.0

## Local Installation

```
  git clone https://github.com/uparix/clojure-archetype.git
  
  mvn clean install
```

### Prerequisites

You need Maven installed on your machine.

## Getting Started
```
mvn archetype:generate \
      -DarchetypeGroupId=com.uparix \
      -DarchetypeArtifactId=clojure-archetype \
      -DarchetypeVersion=1.0.0 \
      -DgroupId=com.example.acme \
      -DartifactId=myproject \
      -DinteractiveMode=false \
      -Dversion=0.0.1-SNAPSHOT
```

## Usage

```
  mvn clean package
```
## Use with Leiningen

Add project.clj to Leiningen in your IDE.


## Release History
 - 1.0.0
   - Initial Release

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.


## Authors

* **Andreas Neuenschwander** - *Initial work* - [Uparix](https://github.com/uparix)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
