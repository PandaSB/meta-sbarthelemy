DESCRIPTION = "Librairie for Led Display"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263" 

DEPENDS = " curl "

SRC_URI = "git://github.com/PandaSB/rpi-rgb-led-matrix.git;protocol=git"
SRCREV = "master"

PR = "r0"

S="${WORKDIR}/git"

INSANE_SKIP_${PN} = "ldflags"
FILES_${PN} += "${libdir}/fonts"


do_compile () {
  make
}

do_install () {
  install -d ${D}/${libdir}
  install -d ${D}/${includedir}
  install -d ${D}/${libdir}/fonts

  install -m 0644 ${S}/lib/librgbmatrix.so.1 ${D}/${libdir}
  install -m 0644 ${S}/include/led-matrix.h ${D}/${includedir}
  install -m 0644 ${S}/include/gpio.h ${D}/${includedir}
  install -m 0644 ${S}/include/canvas.h ${D}/${includedir}  
  install -m 0644 ${S}/include/thread.h ${D}/${includedir}  
  install -m 0644 ${S}/include/transformer.h ${D}/${includedir}  
  install -m 0644 ${S}/include/graphics.h ${D}/${includedir}  

  install -m 0644 ${S}/fonts/10x20.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/4x6.bdf ${D}/${libdir}/fonts                                                                                                                                       
  install -m 0644 ${S}/fonts/5x7.bdf  ${D}/${libdir}/fonts                                                                                                                                        
  install -m 0644 ${S}/fonts/5x8.bdf  ${D}/${libdir}/fonts                                                                                                                                        
  install -m 0644 ${S}/fonts/6x10.bdf ${D}/${libdir}/fonts                                                                                                                                        
  install -m 0644 ${S}/fonts/6x12.bdf ${D}/${libdir}/fonts                                                                                                                                        
  install -m 0644 ${S}/fonts/6x13B.bdf ${D}/${libdir}/fonts                                                                                                                                       
  install -m 0644 ${S}/fonts/6x13.bdf ${D}/${libdir}/fonts                                                                                                                                        
  install -m 0644 ${S}/fonts/6x13O.bdf ${D}/${libdir}/fonts                                                                                                                                       
  install -m 0644 ${S}/fonts/6x9.bdf ${D}/${libdir}/fonts                                                                                                                                         
  install -m 0644 ${S}/fonts/7x13B.bdf ${D}/${libdir}/fonts                                                                                                                                       
  install -m 0644 ${S}/fonts/7x13.bdf  ${D}/${libdir}/fonts                                                                                                                                       
  install -m 0644 ${S}/fonts/7x13O.bdf  ${D}/${libdir}/fonts                                                                                                                                      
  install -m 0644 ${S}/fonts/7x14B.bdf ${D}/${libdir}/fonts                                                                                                                                       
  install -m 0644 ${S}/fonts/7x14.bdf ${D}/${libdir}/fonts                                                                                                                      
  install -m 0644 ${S}/fonts/8x13B.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/8x13.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/8x13O.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/9x15B.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/9x15.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/9x18B.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/9x18.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/clR6x12.bdf ${D}/${libdir}/fonts
  install -m 0644 ${S}/fonts/helvR12.bdf ${D}/${libdir}/fonts
}


