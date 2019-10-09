require recipes-sato/images/core-image-sato.bb

EXTRA_IMAGE_FEATURES += "debug-tweaks package-management ssh-server-openssh"

PYTHON_SUPPORT = "python-imaging python-setuptools python-pip python python-progress python-datetime python-image python-dev python-math"

PYTHON3_SUPPORT = "python3 python3-pip python3-setuptools python3-pillow python3-spidev python3-venv"

RPM_INSTALL = "nokia-lcd wiringpi wiringpi2 python-spidev rpi-gpio"

UTILS_TOOLS = "util-linux-mkfs usbutils alsa-utils"

I2C_TOOLS_SUPPORT = "i2c-tools"

FRAME_BUFFER_SUPPORT = "fbida"

IMAGE_INSTALL += " ${PYTHON_SUPPORT} ${PYTHON3_SUPPORT} ${RPM_INSTALL} ${UTILS_TOOLS} ${I2C_TOOLS_SUPPORT} ${FRAME_BUFFER_SUPPORT}" 