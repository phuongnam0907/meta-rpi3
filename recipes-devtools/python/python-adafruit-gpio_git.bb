# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Library to provide a cross-platform GPIO interface on the Raspberry Pi and Beaglebone Black using the RPi.GPIO and Adafruit_BBIO libraries."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_GPIO/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bda1c9cc018bbe5da02d845724b71d55"

SRC_URI = "git://github.com/adafruit/Adafruit_Python_GPIO.git;protocol=https"

# Modify these as desired
PV = "1.0.4+git${SRCPV}"
SRCREV = "a12fee39839665966bd124fd22588b2c87ced9d2"

S = "${WORKDIR}/git"

inherit setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-compression python-contextlib python-core python-distutils python-io python-logging python-netclient python-setuptools python-shell python-subprocess python-textutils python-unittest"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    Adafruit_BBIO.GPIO
#    Adafruit_BBIO.PWM
#    Adafruit_PureIO.smbus
#    Jetson.GPIO
#    RPi.GPIO
#    ftdi1
#    mock
#    mraa
#    spidev
#    urllib.request


