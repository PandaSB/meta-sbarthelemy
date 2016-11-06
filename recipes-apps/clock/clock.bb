DESCRIPTION = "Librairie for Led Display"
LICENSE = "MIT"
DEPENDS = "rpi-rgb-led-matrix"

LIC_FILES_CHKSUM = "file://COPYING;md5=477cdc3b2e33028da88b92c481890a29" 

SRC_URI = "git://github.com/PandaSB/clock.git;protocol=git"
SRCREV = "master"

PR = "r0"

S="${WORKDIR}/git"

do_compile () {
  make
}

do_install () {
  install -d ${D}/${bindir}
  install -m 0755 ${S}/clock ${D}/${bindir}
}
