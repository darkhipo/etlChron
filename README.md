# etlChron

## Install 
1. Install [java][ij41], version 8 or later.
2. Install scala version 2.13.10 or later:
```bash
wget http://www.scala-lang.org/files/archive/scala-2.13.0-M2.deb ;
sudo dpkg -i scala-2.13.0-M2.deb ;
sudo apt-get update ;
sudo apt-get install scala ;
```
3. Install [sbt][isbt134].
4. Install [Scala IDE][iside].
5. Run these commands:
```bash
cd ~/workspace ;
git clone "https://github.com/darkhipo/etlChron" ;
sbt ;
cd etlChron ;
sbt eclipse ;
```

[ij41]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[isbt134]: http://www.scala-sbt.org/download.html
[iside]: http://scala-ide.org/download/sdk.html
