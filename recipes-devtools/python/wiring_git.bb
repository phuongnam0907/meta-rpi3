# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   debian/copyright
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "LGPLv3 & Unknown"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://wiringPi/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://examples/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://debian/copyright;md5=57b59558ed5484538ae51a1133288f72 \
                    file://gpio/COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/WiringPi/WiringPi.git;protocol=https"

# Modify these as desired
PV = "2.46+git${SRCPV}"
SRCREV = "093e0a17a40e064260c1f3233b1ccdf7e4c66690"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
	:
}

