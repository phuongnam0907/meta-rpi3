# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A python interface to WiringPi 2.0 library which allows for \
    easily interfacing with the GPIO pins of the Raspberry Pi. Also supports \
    i2c and SPI"
HOMEPAGE = "https://github.com/Gadgetoid/WiringPi2-Python/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://WiringPi/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://WiringPi/wiringPi/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://WiringPi/examples/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://WiringPi/gpio/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/Gadgetoid/WiringPi2-Python.git;protocol=https"

# Modify these as desired
PV = "1.1.1+git${SRCPV}"
SRCREV = "620be8c3264ed23a7d45d0a473ffeec3c2a4bc5e"

S = "${WORKDIR}/git"

inherit setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-core"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    _wiringpi2
#    imp


