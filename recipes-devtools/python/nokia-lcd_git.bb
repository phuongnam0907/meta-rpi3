# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Library to display images on the Nokia 5110/3110 LCD."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Nokia_LCD/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bda1c9cc018bbe5da02d845724b71d55"

SRC_URI = "git://github.com/adafruit/Adafruit_Nokia_LCD.git;protocol=https"

# Modify these as desired
PV = "Nokia+git${SRCPV}"
SRCREV = "b78eaa1d034af5f09fca82ba85de01d6637db9a4"

S = "${WORKDIR}/git"

inherit setuptools

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "python-adafruit-gpio"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-compression python-contextlib python-core python-distutils python-io python-netclient python-setuptools python-shell python-subprocess python-textutils"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    Adafruit_GPIO
#    Adafruit_GPIO.SPI
#    urllib.request


