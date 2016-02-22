# jdk8-javac-slow
reproducer for slow jdk8 compiles

The repo will be linked to a jdk bug report soon.

## Test environment
### Environment (A)
* MacBook Pro Retina (Mid 2012)
* 2,6GHz, Intel i7 with 4 cores
* 16GB RAM
* 512GB SSD

* Mac OS 10.11.3
* maven 3.0.x
* jdk1.8.0_72 (see launch/mvn8_72.sh)
* jdk1.8.0_73 (see launch/mvn8_73.sh)
* jdk1.8.0_74 (see launch/mvn8_74.sh)

Compile of this class is also slow when running in IntelliJ IDEA 16 (various EAP releases) using the same JDK.

Compile is reasonably fast when using jdk1.7.0_51, or jdk1.7.0_55 on the same hardware.

mvn clean package takes **6.5 mins**

### Environment (B)
* Fast Dell Notebook (from 2015)
* SSD
* 16 GB RAM

* Windows 10
* maven 3.0.x
* jdk1.8.0_65 (64 bit)

Compile of this class is also slow when running in IntelliJ IDEA 16 (various EAP releases) using the same JDK.

Compile is reasonably fast when using jdk1.7.0_51, or jdk1.7.0_55 on the same hardware.

mvn clean package takes **5 mins**