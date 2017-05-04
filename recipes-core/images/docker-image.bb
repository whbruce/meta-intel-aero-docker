LICENSE = "MIT"
IMAGE_FEATURES += "splash"
inherit core-image
require recipes-core/images/hw-test-tools.inc
CORE_IMAGE_EXTRA_INSTALL += "docker docker-contrib"

