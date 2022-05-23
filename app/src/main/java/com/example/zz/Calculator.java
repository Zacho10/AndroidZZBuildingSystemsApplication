package com.example.zz;

public class Calculator {
    int width;
    int height;
    String doorType;

    public static double calculatePrice(int width, int height, String doorType) {
        double price = 0.0;
        switch (doorType) {
            case "pro1ei60":
                if (height == 2000) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width >= 670 && width <= 795) {
                        price = 305.98;
                    } else if (width >= 805 && width <= 895) {
                        price = 318.95;
                    } else if (width >= 905 && width <= 995) {
                        price = 330.85;
                    } else if (width >= 670 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height == 2050) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1100) {
                        price = 362.20;
                    } else if (width == 1200) {
                        price = 382.74;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width == 1340) {
                        price = 422.75;
                    } else if (width >= 670 && width <= 795) {
                        price = 305.98;
                    } else if (width >= 805 && width <= 895) {
                        price = 318.95;
                    } else if (width >= 905 && width <= 995) {
                        price = 330.85;
                    } else if (width >= 670 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height == 2100) {
                    if (width == 800) {
                        price = 311.39;
                    } else if (width == 900) {
                        price = 323.28;
                    } else if (width == 1000) {
                        price = 337.33;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    } else if (width >= 670 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }


                } else if (height == 2150) {
                    if (width == 800) {
                        price = 294.09;
                    } else if (width == 900) {
                        price = 305.98;
                    } else if (width == 1000) {
                        price = 320.04;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    } else if (width >= 670 && width <= 795) {
                        price = 315.71;
                    } else if (width >= 805 && width <= 895) {
                        price = 326.52;
                    } else if (width >= 905 && width <= 995) {
                        price = 339.50;
                    } else if (width >= 670 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height == 2200) {
                    if (width == 800) {
                        price = 322.20;
                    } else if (width == 900) {
                        price = 338.42;
                    } else if (width == 1000) {
                        price = 354.63;
                    } else if (width == 1100) {
                        price = 414.10;
                    } else if (width == 1200) {
                        price = 437.89;
                    } else if (width == 1300) {
                        price = 470.32;
                    } else if (width == 1340) {
                        price = 476.81;
                    } else if (width >= 670 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }

                } else if (height >= 1950 && height <= 2050) {
                    if (width >= 670 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 670 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 670 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 670 && width <= 900) {
                        price = 419.51;
                    } else if (width >= 901 && width <= 1125) {
                        price = 450.86;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 493.03;
                    }
                } else if (height >= 2501 && height <= 2600) {
                    if (width >= 670 && width <= 900) {
                        price = 435.72;
                    } else if (width >= 901 && width <= 1125) {
                        price = 493.03;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 549.25;
                    }
                }
                break;
            case "pro2ei60":
                if (height == 2000 || height == 2050) {
                    if (width == 1150) {
                        price = 556.50;
                    } else if (width == 1200) {
                        price = 563.92;
                    } else if (width == 1250) {
                        price = 569.22;
                    } else if (width == 1300) {
                        price = 574.52;
                    } else if (width == 1350) {
                        price = 581.94;
                    } else if (width == 1400) {
                        price = 590.42;
                    } else if (width == 1450) {
                        price = 596.78;
                    } else if (width == 1600) {
                        price = 615.86;
                    } else if (width == 1700) {
                        price = 628.58;
                    } else if (width == 1800) {
                        price = 638.12;
                    } else if (width == 1900) {
                        price = 654.02;
                    } else if (width == 2000) {
                        price = 667.80;
                    } else if (width >= 890 && width <= 1280) {
                        price = 596.78;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 609.50;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 625.40;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 629.64;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 651.90;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 678.40;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 783.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 803.48;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 866.02;
                    }
                } else if (height == 2100) {
                    if (width == 1150) {
                        price = 602.08;
                    } else if (width == 1200) {
                        price = 609.50;
                    } else if (width == 1250) {
                        price = 622.22;
                    } else if (width == 1300) {
                        price = 629.64;
                    } else if (width == 1350) {
                        price = 632.82;
                    } else if (width == 1400) {
                        price = 641.30;
                    } else if (width == 1450) {
                        price = 646.60;
                    } else if (width == 1600) {
                        price = 668.86;
                    } else if (width == 1700) {
                        price = 683.70;
                    } else if (width == 1800) {
                        price = 696.42;
                    } else if (width == 1900) {
                        price = 711.26;
                    } else if (width == 2000) {
                        price = 725.04;
                    } else if (width >= 890 && width <= 1260) {
                        price = 654.02;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 662.50;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 673.10;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 676.28;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 691.12;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 687.94;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 694.30;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 725.04;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 749.42;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 805.60;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 824.68;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 887.22;
                    }
                } else if (height == 2150) {
                    if (width == 1150) {
                        price = 573.46;
                    } else if (width == 1200) {
                        price = 581.94;
                    } else if (width == 1250) {
                        price = 591.48;
                    } else if (width == 1300) {
                        price = 597.84;
                    } else if (width == 1350) {
                        price = 602.08;
                    } else if (width == 1400) {
                        price = 607.38;
                    } else if (width == 1450) {
                        price = 612.68;
                    } else if (width == 1600) {
                        price = 633.88;
                    } else if (width == 1700) {
                        price = 649.78;
                    } else if (width == 1800) {
                        price = 665.68;
                    } else if (width == 1900) {
                        price = 675.22;
                    } else if (width == 2000) {
                        price = 689.00;
                    } else if (width >= 890 && width <= 1280) {
                        price = 610.56;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 627.52;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 640.24;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 651.90;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 676.28;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 699.60;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 805.60;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 824.68;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 887.22;
                    }
                } else if (height == 2200) {
                    if (width == 1150) {
                        price = 630.70;
                    } else if (width == 1200) {
                        price = 638.12;
                    } else if (width == 1250) {
                        price = 649.78;
                    } else if (width == 1300) {
                        price = 660.38;
                    } else if (width == 1350) {
                        price = 665.68;
                    } else if (width == 1400) {
                        price = 670.98;
                    } else if (width == 1450) {
                        price = 674.16;
                    } else if (width == 1600) {
                        price = 698.54;
                    } else if (width == 1700) {
                        price = 716.56;
                    } else if (width == 1800) {
                        price = 730.34;
                    } else if (width == 1900) {
                        price = 743.06;
                    } else if (width == 2000) {
                        price = 757.90;
                    } else if (width >= 890 && width <= 1100) {
                        price = 693.24;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 728.22;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 789.70;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 867.08;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 942.34;
                    }
                } else if (height >= 1775 && height <= 2050) {
                    if (width >= 890 && width <= 1260) {
                        price = 641.30;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 650.84;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 662.50;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 666.74;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 680.52;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 682.64;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 682.84;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 701.72;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 727.16;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 783.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 803.48;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 866.02;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 890 && width <= 1260) {
                        price = 654.02;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 662.50;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 673.10;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 676.28;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 691.12;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 687.94;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 694.30;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 725.04;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 749.42;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 805.60;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 824.68;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 887.22;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 890 && width <= 1100) {
                        price = 693.24;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 728.22;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 789.70;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 867.08;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 942.34;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 890 && width <= 1100) {
                        price = 709.14;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 749.42;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 817.26;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 890.40;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 972.02;
                    }
                } else if (height >= 2501 && height <= 2600) {
                    if (width >= 890 && width <= 1100) {
                        price = 766.38;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 811.96;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 860.72;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 974.14;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 1076.96;
                    }
                }
                break;
            case "pro2ei90":
                if (height == 2000 || height == 2050) {
                    if (width == 1600) {
                        price = 866.02;
                    } else if (width == 1700) {
                        price = 879.80;
                    } else if (width == 1800) {
                        price = 895.70;
                    } else if (width == 1900) {
                        price = 910.54;
                    } else if (width == 2000) {
                        price = 923.26;
                    } else if (width >= 1175 && width <= 1260) {
                        price = 831.04;
                    } else if (width >= 1261 && width <= 1600) {
                        price = 872.38;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 905.24;
                    } else if (width >= 2001 && width <= 2270) {
                        price = 1089.68;
                    } else if (width >= 2271 && width <= 2400) {
                        price = 1102.40;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1167.06;
                    }
                } else if (height == 2100) {
                    if (width == 1600) {
                        price = 931.74;
                    } else if (width == 1700) {
                        price = 947.64;
                    } else if (width == 1800) {
                        price = 963.54;
                    } else if (width == 1900) {
                        price = 978.38;
                    } else if (width == 2000) {

                        price = 994.28;
                    } else if (width >= 1175 && width <= 1260) {
                        price = 895.70;
                    } else if (width >= 1261 && width <= 1430) {
                        price = 923.26;
                    } else if (width >= 1431 && width <= 1530) {
                        price = 938.10;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 942.52;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 952.94;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 981.56;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 1017.60;
                    } else if (width >= 2001 && width <= 2270) {
                        price = 1109.82;
                    } else if (width >= 2271 && width <= 2400) {
                        price = 1124.66;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1197.80;
                    }
                } else if (height == 2150) {
                    if (width == 1600) {
                        price = 889.34;
                    } else if (width == 1700) {
                        price = 905.24;
                    } else if (width == 1800) {
                        price = 916.90;
                    } else if (width == 1900) {
                        price = 930.68;
                    } else if (width == 2000) {
                        price = 945.52;
                    } else if (width >= 1175 && width <= 1260) {
                        price = 852.24;
                    } else if (width >= 1261 && width <= 1600) {
                        price = 895.70;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 923.26;
                    } else if (width >= 2001 && width <= 2270) {
                        price = 1109.82;
                    } else if (width >= 2271 && width <= 2400) {
                        price = 1124.66;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1197.80;
                    }
                } else if (height == 2200) {
                    if (width == 1600) {
                        price = 977.32;
                    } else if (width == 1700) {
                        price = 991.10;
                    } else if (width == 1800) {
                        price = 1007.00;
                    } else if (width == 1900) {
                        price = 1022.90;
                    } else if (width == 2000) {
                        price = 1039.86;
                    } else if (width >= 1175 && width <= 1340) {
                        price = 1038.80;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 1096.04;
                    } else if (width >= 1801 && width <= 2270) {
                        price = 1197.80;
                    } else if (width >= 2271 && width <= 2540) {
                        price = 1368.46;
                    }
                } else if (height >= 1775 && height <= 2050) {
                    if (width >= 1175 && width <= 1260) {
                        price = 872.38;
                    } else if (width >= 1261 && width <= 1430) {
                        price = 905.24;
                    } else if (width >= 1431 && width <= 1530) {
                        price = 916.90;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 923.26;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 930.68;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 960.36;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 996.40;
                    } else if (width >= 2001 && width <= 2270) {
                        price = 1089.68;
                    } else if (width >= 2271 && width <= 2400) {
                        price = 1102.40;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1167.06;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 1175 && width <= 1260) {
                        price = 895.70;
                    } else if (width >= 1261 && width <= 1430) {
                        price = 923.26;
                    } else if (width >= 1431 && width <= 1530) {
                        price = 938.10;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 942.52;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 952.94;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 981.56;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 1017.60;
                    } else if (width >= 2001 && width <= 2270) {
                        price = 1109.82;
                    } else if (width >= 2271 && width <= 2400) {
                        price = 1124.66;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1197.80;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 1175 && width <= 1340) {
                        price = 1038.80;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 1096.04;
                    } else if (width >= 1801 && width <= 2270) {
                        price = 1197.80;
                    } else if (width >= 2271 && width <= 2540) {
                        price = 1368.46;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 1175 && width <= 1340) {
                        price = 1075.90;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 1139.50;
                    } else if (width >= 1801 && width <= 2270) {
                        price = 1383.30;
                    } else if (width >= 2271 && width <= 2540) {
                        price = 1442.66;
                    }
                } else if (height >= 2501 && height <= 2630) {
                    if (width >= 1175 && width <= 1340) {
                        price = 1102.40;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 1167.06;
                    } else if (width >= 1801 && width <= 2270) {
                        price = 1411.92;
                    } else if (width >= 2271 && width <= 2540) {
                        price = 1442.66;
                    }
                }
                break;
            case "pro1ei120":
                if (height == 2000) {
                    if (width == 800) {
                        price = 427.18;
                    } else if (width == 900) {
                        price = 440.96;
                    } else if (width == 1000) {
                        price = 457.92;
                    } else if (width == 1300) {
                        price = 561.80;
                    } else if (width >= 710 && width <= 795) {
                        price = 436.72;
                    } else if (width >= 805 && width <= 895) {
                        price = 451.56;
                    } else if (width >= 905 && width <= 995) {
                        price = 467.46;
                    } else if (width >= 710 && width <= 800) {
                        price = 478.06;
                    } else if (width >= 801 && width <= 900) {
                        price = 492.90;
                    } else if (width >= 901 && width <= 1000) {
                        price = 505.62;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 542.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 558.62;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 597.84;
                    }
                } else if (height == 2050) {
                    if (width == 800) {
                        price = 427.18;
                    } else if (width == 900) {
                        price = 440.96;
                    } else if (width == 1000) {
                        price = 457.92;
                    } else if (width == 1100) {
                        price = 515.16;
                    } else if (width == 1200) {
                        price = 528.94;
                    } else if (width == 1300) {
                        price = 561.80;
                    } else if (width == 1340) {
                        price = 567.10;
                    } else if (width >= 710 && width <= 795) {
                        price = 436.72;
                    } else if (width >= 805 && width <= 895) {
                        price = 451.56;
                    } else if (width >= 905 && width <= 995) {
                        price = 467.46;
                    } else if (width >= 710 && width <= 800) {
                        price = 478.06;
                    } else if (width >= 801 && width <= 900) {
                        price = 492.90;
                    } else if (width >= 901 && width <= 1000) {
                        price = 505.62;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 542.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 558.62;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 597.84;
                    }

                } else if (height == 2100) {
                    if (width == 800) {
                        price = 457.92;
                    } else if (width == 900) {
                        price = 474.88;
                    } else if (width == 1000) {
                        price = 485.48;
                    } else if (width == 1100) {
                        price = 521.52;
                    } else if (width == 1200) {
                        price = 536.36;
                    } else if (width == 1300) {
                        price = 567.10;
                    } else if (width == 1340) {
                        price = 575.58;
                    } else if (width >= 710 && width <= 800) {
                        price = 484.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 500.32;
                    } else if (width >= 901 && width <= 1000) {
                        price = 515.16;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 551.20;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 564.98;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 604.20;
                    }

                } else if (height == 2150) {
                    if (width == 800) {
                        price = 434.60;
                    } else if (width == 900) {
                        price = 450.50;
                    } else if (width == 1000) {
                        price = 464.28;
                    } else if (width == 1100) {
                        price = 521.52;
                    } else if (width == 1200) {
                        price = 536.36;
                    } else if (width == 1300) {
                        price = 567.10;
                    } else if (width == 1340) {
                        price = 575.58;
                    } else if (width >= 710 && width <= 795) {
                        price = 440.96;
                    } else if (width >= 805 && width <= 895) {
                        price = 461.10;
                    } else if (width >= 905 && width <= 995) {
                        price = 472.76;
                    } else if (width >= 710 && width <= 800) {
                        price = 484.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 500.32;
                    } else if (width >= 901 && width <= 1000) {
                        price = 515.16;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 551.20;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 564.98;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 604.20;
                    }

                } else if (height == 2200) {
                    if (width == 800) {
                        price = 478.06;
                    } else if (width == 900) {
                        price = 495.02;
                    } else if (width == 1000) {
                        price = 508.80;
                    } else if (width == 1100) {
                        price = 569.22;
                    } else if (width == 1200) {
                        price = 590.42;
                    } else if (width == 1300) {
                        price = 623.28;
                    } else if (width == 1340) {
                        price = 630.70;
                    } else if (width >= 710 && width <= 900) {
                        price = 546.96;
                    } else if (width >= 901 && width <= 1125) {
                        price = 591.48;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 632.82;
                    }

                } else if (height >= 1900 && height <= 2050) {
                    if (width >= 710 && width <= 800) {
                        price = 478.06;
                    } else if (width >= 801 && width <= 900) {
                        price = 492.90;
                    } else if (width >= 901 && width <= 1000) {
                        price = 505.62;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 542.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 558.62;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 597.84;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 710 && width <= 800) {
                        price = 484.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 500.32;
                    } else if (width >= 901 && width <= 1000) {
                        price = 515.16;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 551.20;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 564.98;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 604.20;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 710 && width <= 900) {
                        price = 546.96;
                    } else if (width >= 901 && width <= 1125) {
                        price = 591.48;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 632.82;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 710 && width <= 900) {
                        price = 567.10;
                    } else if (width >= 901 && width <= 1125) {
                        price = 612.68;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 728.22;
                    }
                } else if (height >= 2501 && height <= 2640) {
                    if (width >= 710 && width <= 900) {
                        price = 591.48;
                    } else if (width >= 901 && width <= 1125) {
                        price = 708.08;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 749.22;
                    }
                }
                break;
            case "pro1rei60":
                if (height == 2000) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width >= 546 && width <= 795) {
                        price = 305.98;
                    } else if (width >= 805 && width <= 895) {
                        price = 318.95;
                    } else if (width >= 905 && width <= 995) {
                        price = 330.85;
                    } else if (width >= 641 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }

                } else if (height == 2050) {
                    if (width == 800) {
                        price = 282.19;
                    } else if (width == 900) {
                        price = 296.25;
                    } else if (width == 1000) {
                        price = 305.98;
                    } else if (width == 1100) {
                        price = 362.20;
                    } else if (width == 1200) {
                        price = 382.74;
                    } else if (width == 1300) {
                        price = 415.18;
                    } else if (width == 1340) {
                        price = 422.75;
                    } else if (width >= 546 && width <= 795) {
                        price = 305.98;
                    } else if (width >= 805 && width <= 895) {
                        price = 318.95;
                    } else if (width >= 905 && width <= 995) {
                        price = 330.85;
                    } else if (width >= 641 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height == 2100) {
                    if (width == 800) {
                        price = 311.39;
                    } else if (width == 900) {
                        price = 323.28;
                    } else if (width == 1000) {
                        price = 337.33;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    } else if (width >= 546 && width <= 640) {
                        price = 325.42;
                    } else if (width >= 641 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height == 2150) {
                    if (width == 800) {
                        price = 294.09;
                    } else if (width == 900) {
                        price = 305.98;
                    } else if (width == 1000) {
                        price = 320.04;
                    } else if (width == 1100) {
                        price = 376.26;
                    } else if (width == 1200) {
                        price = 396.80;
                    } else if (width == 1300) {
                        price = 428.16;
                    } else if (width == 1340) {
                        price = 438.97;
                    } else if (width >= 546 && width <= 795) {
                        price = 315.71;
                    } else if (width >= 805 && width <= 895) {
                        price = 326.52;
                    } else if (width >= 905 && width <= 995) {
                        price = 339.50;
                    } else if (width >= 641 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height == 2200) {
                    if (width == 800) {
                        price = 322.20;
                    } else if (width == 900) {
                        price = 338.42;
                    } else if (width == 1000) {
                        price = 354.63;
                    } else if (width == 1100) {
                        price = 414.10;
                    } else if (width == 1200) {
                        price = 437.89;
                    } else if (width == 1300) {
                        price = 470.32;
                    } else if (width == 1340) {
                        price = 476.81;
                    } else if (width >= 546 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }
                } else if (height >= 1775 && height <= 2050) {
                    if (width >= 546 && width <= 640) {
                        price = 320.12;
                    } else if (width >= 641 && width <= 800) {
                        price = 338.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 354.63;
                    } else if (width >= 901 && width <= 1000) {
                        price = 366.53;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 395.72;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 408.69;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 448.70;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 546 && width <= 640) {
                        price = 325.42;
                    } else if (width >= 641 && width <= 800) {
                        price = 345.98;
                    } else if (width >= 801 && width <= 900) {
                        price = 357.88;
                    } else if (width >= 901 && width <= 1000) {
                        price = 371.93;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 403.29;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 417.34;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 456.27;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 546 && width <= 900) {
                        price = 402.21;
                    } else if (width >= 901 && width <= 1125) {
                        price = 435.72;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 476.81;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 546 && width <= 900) {
                        price = 419.51;
                    } else if (width >= 901 && width <= 1125) {
                        price = 450.86;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 493.03;
                    }
                } else if (height >= 2501 && height <= 2670) {
                    if (width >= 546 && width <= 900) {
                        price = 435.72;
                    } else if (width >= 901 && width <= 1125) {
                        price = 493.03;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 549.25;
                    }
                }
                break;
            case "pro2rei60":
                if (height == 2000 || height == 2050) {
                    if (width == 1150) {
                        price = 556.50;
                    } else if (width == 1200) {
                        price = 563.92;
                    } else if (width == 1250) {
                        price = 569.22;
                    } else if (width == 1300) {
                        price = 574.52;
                    } else if (width == 1350) {
                        price = 581.94;
                    } else if (width == 1400) {
                        price = 590.42;
                    } else if (width == 1450) {
                        price = 596.78;
                    } else if (width == 1600) {
                        price = 615.86;
                    } else if (width == 1700) {
                        price = 628.58;
                    } else if (width == 1800) {
                        price = 638.12;
                    } else if (width == 1900) {
                        price = 654.02;
                    } else if (width == 2000) {
                        price = 667.80;
                    } else if (width >= 890 && width <= 1280) {
                        price = 596.78;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 609.50;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 625.40;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 629.64;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 651.90;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 678.40;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 783.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 803.48;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 866.02;
                    }

                } else if (height == 2100) {
                    if (width == 1150) {
                        price = 602.08;
                    } else if (width == 1200) {
                        price = 609.50;
                    } else if (width == 1250) {
                        price = 622.22;
                    } else if (width == 1300) {
                        price = 629.64;
                    } else if (width == 1350) {
                        price = 632.82;
                    } else if (width == 1400) {
                        price = 641.30;
                    } else if (width == 1450) {
                        price = 646.60;
                    } else if (width == 1600) {
                        price = 668.86;
                    } else if (width == 1700) {
                        price = 683.70;
                    } else if (width == 1800) {
                        price = 696.42;
                    } else if (width == 1900) {
                        price = 711.26;
                    } else if (width == 2000) {
                        price = 725.04;
                    } else if (width >= 890 && width <= 1260) {
                        price = 654.02;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 662.50;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 673.10;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 676.28;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 691.12;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 687.94;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 694.30;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 710.20;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 725.04;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 749.42;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 805.60;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 824.68;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 887.22;
                    }

                } else if (height == 2150) {
                    if (width == 1150) {
                        price = 573.46;
                    } else if (width == 1200) {
                        price = 581.94;
                    } else if (width == 1250) {
                        price = 591.48;
                    } else if (width == 1300) {
                        price = 597.84;
                    } else if (width == 1350) {
                        price = 602.08;
                    } else if (width == 1400) {
                        price = 607.38;
                    } else if (width == 1450) {
                        price = 612.68;
                    } else if (width == 1600) {
                        price = 633.88;
                    } else if (width == 1700) {
                        price = 649.78;
                    } else if (width == 1800) {
                        price = 665.68;
                    } else if (width == 1900) {
                        price = 675.22;
                    } else if (width == 2000) {
                        price = 689;
                    } else if (width >= 890 && width <= 1280) {
                        price = 610.56;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 627.52;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 640.24;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 651.90;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 676.28;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 699.60;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 805.60;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 824.68;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 887.22;
                    }

                } else if (height == 2200) {
                    if (width == 1150) {
                        price = 630.70;
                    } else if (width == 1200) {
                        price = 638.12;
                    } else if (width == 1250) {
                        price = 649.78;
                    } else if (width == 1300) {
                        price = 660.38;
                    } else if (width == 1350) {
                        price = 665.68;
                    } else if (width == 1400) {
                        price = 670.98;
                    } else if (width == 1450) {
                        price = 674.16;
                    } else if (width == 1600) {
                        price = 698.54;
                    } else if (width == 1700) {
                        price = 716.56;
                    } else if (width == 1800) {
                        price = 730.34;
                    } else if (width == 1900) {
                        price = 743.08;
                    } else if (width == 2000) {
                        price = 757.90;
                    } else if (width >= 890 && width <= 1100) {
                        price = 693.24;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 728.22;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 789.70;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 867.08;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 942.34;
                    }

                } else if (height >= 1775 && height <= 2050) {
                    if (width >= 890 && width <= 1260) {
                        price = 641.30;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 650.84;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 662.50;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 666.74;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 680.52;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 682.64;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 682.84;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 694.30;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 701.72;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 727.16;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 783.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 803.48;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 866.02;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 890 && width <= 1260) {
                        price = 654.02;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 662.50;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 673.10;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 676.28;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 691.12;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 687.94;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 694.30;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 710.20;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 725.04;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 749.42;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 805.60;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 824.68;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 887.22;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 890 && width <= 1100) {
                        price = 693.24;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 728.22;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 789.70;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 867.08;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 942.34;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 890 && width <= 1100) {
                        price = 709.14;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 749.42;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 817.26;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 890.40;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 972.02;
                    }
                } else if (height >= 2501 && height <= 2670) {
                    if (width >= 890 && width <= 1100) {
                        price = 766.38;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 811.96;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 860.72;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 974.14;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 1076.96;
                    }
                }
                break;
            case "pro1rei120":
                if (height == 2000) {
                    if (width == 800) {
                        price = 319.06;
                    } else if (width == 900) {
                        price = 339.20;
                    } else if (width == 1000) {
                        price = 351.92;
                    } else if (width == 1300) {
                        price = 478.06;
                    } else if (width >= 546 && width <= 795) {
                        price = 345.56;
                    } else if (width >= 805 && width <= 895) {
                        price = 361.46;
                    } else if (width >= 905 && width <= 995) {
                        price = 378.42;
                    } else if (width >= 641 && width <= 800) {
                        price = 378.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 392.20;
                    } else if (width >= 901 && width <= 1000) {
                        price = 411.28;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 451.56;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 466.40;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 515.16;
                    }

                } else if (height == 2050) {
                    if (width == 800) {
                        price = 319.06;
                    } else if (width == 900) {
                        price = 339.20;
                    } else if (width == 1000) {
                        price = 351.92;
                    } else if (width == 1100) {
                        price = 415.52;
                    } else if (width == 1200) {
                        price = 442.02;
                    } else if (width == 1300) {
                        price = 478.06;
                    } else if (width == 1340) {
                        price = 486.54;
                    } else if (width >= 546 && width <= 795) {
                        price = 345.56;
                    } else if (width >= 805 && width <= 895) {
                        price = 361.46;
                    } else if (width >= 905 && width <= 995) {
                        price = 378.42;
                    } else if (width >= 641 && width <= 800) {
                        price = 378.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 392.20;
                    } else if (width >= 901 && width <= 1000) {
                        price = 411.28;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 451.56;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 466.40;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 515.16;
                    }
                } else if (height == 2100) {
                    if (width == 800) {
                        price = 355.10;
                    } else if (width == 900) {
                        price = 369.94;
                    } else if (width == 1000) {
                        price = 387.96;
                    } else if (width == 1100) {
                        price = 434.60;
                    } else if (width == 1200) {
                        price = 460.04;
                    } else if (width == 1300) {
                        price = 498.20;
                    } else if (width == 1340) {
                        price = 509.86;
                    } else if (width >= 546 && width <= 640) {
                        price = 366.76;
                    } else if (width >= 641 && width <= 800) {
                        price = 385.84;
                    } else if (width >= 801 && width <= 900) {
                        price = 403.86;
                    } else if (width >= 901 && width <= 1000) {
                        price = 421.88;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 466.40;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 482.30;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 522.58;
                    }
                } else if (height == 2150) {
                    if (width == 800) {
                        price = 336.02;
                    } else if (width == 900) {
                        price = 350.86;
                    } else if (width == 1000) {
                        price = 368.88;
                    } else if (width == 1100) {
                        price = 434.60;
                    } else if (width == 1200) {
                        price = 460.04;
                    } else if (width == 1300) {
                        price = 498.20;
                    } else if (width == 1340) {
                        price = 509.86;
                    } else if (width >= 546 && width <= 795) {
                        price = 355.10;
                    } else if (width >= 805 && width <= 895) {
                        price = 368.88;
                    } else if (width >= 905 && width <= 995) {
                        price = 385.84;
                    } else if (width >= 641 && width <= 800) {
                        price = 385.84;
                    } else if (width >= 801 && width <= 900) {
                        price = 403.86;
                    } else if (width >= 901 && width <= 1000) {
                        price = 421.88;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 466.40;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 482.30;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 522.58;
                    }
                } else if (height == 2200) {
                    if (width == 800) {
                        price = 368.88;
                    } else if (width == 900) {
                        price = 387.96;
                    } else if (width == 1000) {
                        price = 407.04;
                    } else if (width == 1100) {
                        price = 478.06;
                    } else if (width == 1200) {
                        price = 504.56;
                    } else if (width == 1300) {
                        price = 548.02;
                    } else if (width == 1340) {
                        price = 558.62;
                    } else if (width >= 546 && width <= 900) {
                        price = 453.68;
                    } else if (width >= 901 && width <= 1125) {
                        price = 505.62;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 560.74;
                    }
                } else if (height >= 1775 && height <= 2050) {
                    if (width >= 546 && width <= 640) {
                        price = 362.52;
                    } else if (width >= 641 && width <= 800) {
                        price = 378.42;
                    } else if (width >= 801 && width <= 900) {
                        price = 392.20;
                    } else if (width >= 901 && width <= 1000) {
                        price = 411.28;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 451.56;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 466.40;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 515.16;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 546 && width <= 640) {
                        price = 366.76;
                    } else if (width >= 641 && width <= 800) {
                        price = 385.84;
                    } else if (width >= 801 && width <= 900) {
                        price = 403.86;
                    } else if (width >= 901 && width <= 1000) {
                        price = 421.88;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 466.40;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 482.30;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 522.58;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 546 && width <= 900) {
                        price = 453.68;
                    } else if (width >= 901 && width <= 1125) {
                        price = 505.62;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 560.74;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 546 && width <= 900) {
                        price = 478.06;
                    } else if (width >= 901 && width <= 1125) {
                        price = 523.64;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 645.54;
                    }
                } else if (height >= 2501 && height <= 2670) {
                    if (width >= 546 && width <= 900) {
                        price = 505.62;
                    } else if (width >= 901 && width <= 1125) {
                        price = 617.98;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 674.16;
                    }
                }
                break;
            case "pro2rei120":
                if (height == 2000 || height == 2050) {
                    if (width == 1150) {
                        price = 649.78;
                    } else if (width == 1200) {
                        price = 661.44;
                    } else if (width == 1250) {
                        price = 667.80;
                    } else if (width == 1300) {
                        price = 676.28;
                    } else if (width == 1350) {
                        price = 684.76;
                    } else if (width == 1400) {
                        price = 696.42;
                    } else if (width == 1450) {
                        price = 707.02;
                    } else if (width == 1600) {
                        price = 728.22;
                    } else if (width == 1700) {
                        price = 746.24;
                    } else if (width == 1800) {
                        price = 768.50;
                    } else if (width == 1900) {
                        price = 785.46;
                    } else if (width == 2000) {
                        price = 802.42;
                    } else if (width >= 890 && width <= 1280) {
                        price = 714.44;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 730.34;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 747.30;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 751.54;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 783.34;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 814.08;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 952.94;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 988.98;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1044.10;
                    }
                } else if (height == 2100) {
                    if (width == 1150) {
                        price = 708.08;
                    } else if (width == 1200) {
                        price = 716.56;
                    } else if (width == 1250) {
                        price = 729.28;
                    } else if (width == 1300) {
                        price = 738.82;
                    } else if (width == 1350) {
                        price = 745.18;
                    } else if (width == 1400) {
                        price = 755.78;
                    } else if (width == 1450) {
                        price = 762.14;
                    } else if (width == 1600) {
                        price = 797.12;
                    } else if (width == 1700) {
                        price = 819.38;
                    } else if (width == 1800) {
                        price = 832.10;
                    } else if (width == 1900) {
                        price = 856.48;
                    } else if (width == 2000) {
                        price = 873.44;
                    } else if (width >= 890 && width <= 1260) {
                        price = 772.74;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 782.28;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 797.12;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 802.42;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 819.38;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 825.74;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 836.34;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 842.70;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 873.44;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 912.66;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 987.92;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 1013.36;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1086.50;
                    }

                } else if (height == 2150) {
                    if (width == 1150) {
                        price = 673.10;
                    } else if (width == 1200) {
                        price = 682.64;
                    } else if (width == 1250) {
                        price = 693.24;
                    } else if (width == 1300) {
                        price = 704.90;
                    } else if (width == 1350) {
                        price = 713.38;
                    } else if (width == 1400) {
                        price = 719.74;
                    } else if (width == 1450) {
                        price = 727.16;
                    } else if (width == 1600) {
                        price = 758.96;
                    } else if (width == 1700) {
                        price = 780.16;
                    } else if (width == 1800) {
                        price = 795.00;
                    } else if (width == 1900) {
                        price = 813.02;
                    } else if (width == 2000) {
                        price = 832.10;
                    } else if (width >= 890 && width <= 1280) {
                        price = 738.82;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 754.72;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 769.56;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 773.80;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 808.78;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 848.00;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 987.92;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 1013.36;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1086.50;
                    }

                } else if (height == 2200) {
                    if (width == 1150) {
                        price = 740.94;
                    } else if (width == 1200) {
                        price = 749.42;
                    } else if (width == 1250) {
                        price = 762.14;
                    } else if (width == 1300) {
                        price = 773.80;
                    } else if (width == 1350) {
                        price = 783.34;
                    } else if (width == 1400) {
                        price = 789.70;
                    } else if (width == 1450) {
                        price = 799.24;
                    } else if (width == 1600) {
                        price = 832.10;
                    } else if (width == 1700) {
                        price = 856.48;
                    } else if (width == 1800) {
                        price = 871.32;
                    } else if (width == 1900) {
                        price = 896.76;
                    } else if (width == 2000) {
                        price = 916.90;
                    } else if (width >= 890 && width <= 1100) {
                        price = 809.84;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 862.84;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 952.94;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 1054.70;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 1242.32;
                    }

                } else if (height >= 1775 && height <= 2050) {
                    if (width >= 890 && width <= 1260) {
                        price = 744.12;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 764.26;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 780.16;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 784.30;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 802.42;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 804.54;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 804.54;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 819.38;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 846.94;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 879.80;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 952.94;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 988.98;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1044.10;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 890 && width <= 1260) {
                        price = 772.74;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 782.28;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 797.12;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 802.42;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 819.38;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 825.74;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 836.34;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 842.70;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 873.44;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 912.66;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 987.92;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 1013.36;
                    } else if (width >= 2401 && width <= 2540) {
                        price = 1086.50;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 890 && width <= 1100) {
                        price = 809.84;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 862.84;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 952.94;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 1054.70;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 1242.32;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 890 && width <= 1100) {
                        price = 832.10;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 886.16;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 981.56;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 1227.48;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 1264.58;
                    }
                } else if (height >= 2501 && height <= 2670) {
                    if (width >= 890 && width <= 1100) {
                        price = 907.36;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 967.36;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 1048.34;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 1279.42;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 1367.40;
                    }
                }
                break;
            case "uni1e60":
                if(height == 2050)  {
                    if(width == 800){
                        price = 239.30 ;
                    }else if( width == 900){
                        price = 249.31 ;
                    }else if(width == 1000){
                        price = 257.10 ;
                    }
                }else if(height == 2100) {
                    if(width == 900){
                        price = 252.65 ;
                    }else if (width == 1000){
                        price = 262.67 ;
                    }
                }else if( height == 2150){
                    if(width== 800){
                        price = 247.09 ;
                    }else if(width == 900){
                        price = 252.65 ;
                    }else if(width == 1000){
                        price = 262.67 ;
                    }
                }
                break;
            case "uni1ei60" :
                if(height == 2050)  {
                    if(width == 800){
                        price = 255.16 ;
                    }else if( width == 900){
                        price = 268.14 ;
                    }else if(width == 1000){
                        price = 280.03 ;
                    }else if(width == 1100){
                        price = 302.74 ;
                    }
                }else if(height == 2100) {
                    if(width == 900){
                        price = 274.62 ;
                    }else if (width == 1000){
                        price = 289.76 ;
                    }
                }else if( height == 2150){
                    if(width== 800){
                        price = 263.81 ;
                    }else if(width == 900){
                        price = 274.62 ;
                    }else if(width == 1000){
                        price = 289.76 ;
                    }else if(width==1100){
                        price = 315.71 ;
                    }
                }
                break;
            case "uni2ei60":
                if(height == 2050)  {
                    if(width == 1600){
                        price = 568.16 ;
                    }else if( width == 1800){
                        price = 599.96 ;
                    }else if(width == 2000){
                        price = 626.46 ;
                    }
                }else if( height == 2150){
                    if(width== 1200){
                        price = 560.74 ;
                    }else if(width == 1300){
                        price = 574.52 ;
                    }else if(width == 1400){
                        price = 588.30 ;
                    }else if(width==1600){
                        price = 591.48 ;
                    }else if(width==1800){
                        price = 617.98 ;
                    }else if(width==2000){
                        price = 639.18 ;
                    }
                }
                break;
            case "uni1ei90":
                if(height == 2050)  {
                    if(width == 800){
                        price = 270.30 ;
                    }else if( width == 900){
                        price = 281.96 ;
                    }else if(width == 1000){
                        price = 293.62 ;
                    }
                }else if(height == 2100) {
                    if(width == 900){
                        price = 292.56 ;
                    }else if (width == 1000){
                        price = 305.28 ;
                    }
                }else if( height == 2150){
                    if(width== 800){
                        price = 280.90 ;
                    }else if(width == 900){
                        price = 292.56 ;
                    }else if(width == 1000){
                        price = 305.28 ;
                    }
                }
                break;
            case "uni2ei90" :
                if(height == 2050)  {
                    if(width == 1600){
                        price = 672.04 ;
                    }else if( width == 1800){
                        price = 708.08 ;
                    }else if(width == 2000){
                        price = 742.00 ;
                    }
                }else if( height == 2150){
                    if(width== 1600){
                        price = 699.60 ;
                    }else if(width == 1800){
                        price = 734.58 ;
                    }else if(width == 2000){
                        price = 769.56 ;
                    }
                }
                break;
            case "uni1rei120" :
                if(height == 2050)  {
                    if(width == 800){
                        price = 270.30 ;
                    }else if( width == 900){
                        price = 281.96 ;
                    }else if(width == 1000){
                        price = 293.62 ;
                    }else if(width==1100){
                        price= 338.14 ;
                    }else if(width== 1200){
                        price= 374.18;
                    }
                }else if(height == 2100) {
                    if(width == 900){
                        price = 292.56 ;
                    }else if (width == 1000){
                        price = 305.28 ;
                    }
                }else if( height == 2150){
                    if(width== 800){
                        price = 280.90 ;
                    }else if(width == 900){
                        price = 292.56 ;
                    }else if(width == 1000){
                        price = 305.28 ;
                    }else if(width==1100){
                        price = 347.68 ;
                    }else if(width==1200){
                        price = 385.84 ;
                    }else if(width == 1300){
                        price = 421.88 ;
                    }else if(width == 1350){
                        price = 430.36 ;
                    }
                }
                break;
            case "uni2rei120" :
                if(height == 2050)  {
                    if(width == 1200){
                        price = 585.12 ;
                    }else if( width == 1300){
                        price = 598.90 ;
                    }else if(width == 1400){
                        price = 615.86 ;
                    }else if(width == 1600){
                        price = 644.48 ;
                    }else if(width==1800){
                        price= 676.28 ;
                    }else if(width==2000){
                        price = 711.26 ;
                    }
                }else if( height == 2150){
                    if(width == 1200){
                        price = 602.08 ;
                    }else if( width == 1300){
                        price = 622.22 ;
                    }else if(width == 1400){
                        price = 632.82 ;
                    }else if(width == 1600){
                        price = 669.92 ;
                    }else if(width==1800){
                        price= 704.90 ;
                    }else if(width==2000){
                        price = 735.64 ;
                    }
                }
                break;
            case "rever1" :
                if(height == 2050)  {
                    if(width == 700){
                        price = 170.24 ;
                    }else if( width == 800){
                        price = 178.08 ;
                    }else if(width== 900){
                        price = 184.80 ;
                    }else if(width == 1000){
                        price = 193.76 ;
                    }else if(width==1100){
                        price= 217.28 ;
                    }else if(width== 1200){
                        price= 217.28;
                    }
                }else if(height == 2100) {
                    if(width==800){
                        price = 183.68 ;
                    } else if(width == 900){
                        price = 192.64 ;
                    }else if (width == 1000){
                        price = 196.00 ;
                    }
                }else if( height == 2150){
                    if(width== 700){
                        price= 173.60;
                    }else if(width== 800){
                        price = 183.68 ;
                    }else if(width == 900){
                        price = 192.64 ;
                    }else if(width == 1000){
                        price = 196.00 ;
                    }else if(width==1100){
                        price = 221.76 ;
                    }else if(width==1200){
                        price = 221.76 ;
                    }else if(width == 1300){
                        price = 253.12 ;
                    }else if(width == 1350){
                        price = 253.12 ;
                    }
                }
                break;
            case "rever2" :
                if(height == 2050)  {
                    if(width == 1200){
                        price = 358.40 ;
                    }else if( width == 1300){
                        price = 365.12 ;
                    }else if(width == 1400){
                        price = 370.72 ;
                    }else if(width==1600){
                        price= 383.04 ;
                    }else if(width== 1800){
                        price= 399.84;
                    }else if(width==2000){
                        price = 414.40;
                    }
                }else if( height == 2150){
                    if(width== 1200){
                        price = 361.76 ;
                    }else if(width == 1300){
                        price = 371.84 ;
                    }else if(width == 1400){
                        price = 374.08 ;
                    }else if(width==2000){
                        price = 421.12 ;
                    }
                }
                break;
            case "unim1":
                if(height == 2050)  {
                    if(width == 800){
                        price = 232.62 ;
                    }else if( width == 900){
                        price = 237.07 ;
                    }else if(width == 1000) {
                        price = 250.43;
                    }
                }else if(height == 2100) {
                    if(width == 900){
                        price = 242.63 ;
                    }else if (width == 1000){
                        price = 255.99 ;
                    }
                }else if( height == 2150){
                    if(width== 800){
                        price = 234.84 ;
                    }else if(width == 900){
                        price = 242.63 ;
                    }else if(width == 1000){
                        price = 255.99 ;
                    }
                }
                break;
            case "unim2":
                if(height == 2050)  {
                    if(width == 1300){
                        price = 486.38 ;
                    }else if( width == 1400){
                        price = 498.62 ;
                    }else if(width == 1600){
                        price = 523.11 ;
                    }else if(width==1800){
                        price= 542.03 ;
                    }else if(width== 2000){
                        price= 567.63;
                    }
                }else if( height == 2150){
                    if(width== 1300){
                        price = 496.40 ;
                    }else if(width == 1400){
                        price = 509.75 ;
                    }else if(width == 1800){
                        price = 552.05 ;
                    }else if(width==2000){
                        price = 578.76  ;
                    }
                }
                break;
            case "prom1" :
                if (height == 2000) {
                    if (width == 800) {
                        price = 282.21;
                    } else if (width == 900) {
                        price = 288.83;
                    } else if (width == 1000) {
                        price = 302.06;
                    } else if (width == 1300) {
                        price = 384.74;
                    } else if (width >= 500 && width <= 795) {
                        price = 288.83;
                    } else if (width >= 805 && width <= 895) {
                        price = 299.85;
                    } else if (width >= 905 && width <= 995) {
                        price = 311.98;
                    }else if (width >= 500 && width <= 640) {
                        price = 304.26;
                    } else if (width >= 641 && width <= 800) {
                        price = 329.62;
                    } else if (width >= 801 && width <= 900) {
                        price = 340.64;
                    } else if (width >= 901 && width <= 1000) {
                        price = 351.67;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 363.79;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 374.82;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 411.20;
                    }

                } else if (height == 2050) {
                    if (width == 800) {
                        price = 283.32;
                    } else if (width == 900) {
                        price = 289.93;
                    } else if (width == 1000) {
                        price = 303.16;
                    } else if (width == 1100) {
                        price = 340.64;
                    } else if (width == 1200) {
                        price = 350.56;
                    } else if (width == 1300) {
                        price = 385.84;
                    } else if (width == 1340) {
                        price = 392.45;
                    } else if (width >= 500 && width <= 795) {
                        price = 288.83;
                    } else if (width >= 805 && width <= 895) {
                        price = 299.85;
                    } else if (width >= 905 && width <= 995) {
                        price = 311.98;
                    }else if (width >= 500 && width <= 640) {
                        price = 304.26;
                    } else if (width >= 641 && width <= 800) {
                        price = 329.62;
                    } else if (width >= 801 && width <= 900) {
                        price = 340.64;
                    } else if (width >= 901 && width <= 1000) {
                        price = 351.67;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 363.79;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 374.82;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 411.20;
                    }
                } else if (height == 2100) {
                    if (width == 800) {
                        price = 306.47;
                    } else if (width == 900) {
                        price = 316.39;
                    } else if (width == 1000) {
                        price = 329.62;
                    } else if (width == 1100) {
                        price = 348.36;
                    } else if (width == 1200) {
                        price = 359.38;
                    } else if (width == 1300) {
                        price = 392.45;
                    } else if (width == 1340) {
                        price = 406.79;
                    }else if (width >= 500 && width <= 640) {
                        price = 313.08;
                    } else if (width >= 641 && width <= 800) {
                        price = 335.13;
                    } else if (width >= 801 && width <= 900) {
                        price = 350.56;
                    } else if (width >= 901 && width <= 1000) {
                        price = 359.38;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 385.84;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 394.66;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 428.83;
                    }
                } else if (height == 2150) {
                    if (width == 800) {
                        price = 287.73;
                    } else if (width == 900) {
                        price = 296.55;
                    } else if (width == 1000) {
                        price = 308.67;
                    } else if (width == 1100) {
                        price = 347.26;
                    } else if (width == 1200) {
                        price = 357.18;
                    } else if (width == 1300) {
                        price = 391.35;
                    } else if (width == 1340) {
                        price = 405.68;
                    } else if (width >= 500 && width <= 795) {
                        price = 298.75;
                    } else if (width >= 805 && width <= 895) {
                        price = 310.88;
                    } else if (width >= 905 && width <= 995) {
                        price = 319.70;
                    }else if (width >= 500 && width <= 640) {
                        price = 313.08;
                    } else if (width >= 641 && width <= 800) {
                        price = 335.13;
                    } else if (width >= 801 && width <= 900) {
                        price = 350.56;
                    } else if (width >= 901 && width <= 1000) {
                        price = 359.38;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 385.84;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 394.66;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 428.83;
                    }
                } else if (height == 2200) {
                    if (width == 800) {
                        price = 320.80;
                    } else if (width == 900) {
                        price = 327.41;
                    } else if (width == 1000) {
                        price = 343.95;
                    } else if (width == 1100) {
                        price = 379.23;
                    } else if (width == 1200) {
                        price = 390.25;
                    } else if (width == 1300) {
                        price = 425.53;
                    } else if (width == 1340) {
                        price = 428.83;
                    }else if (width >= 500 && width <= 900) {
                        price = 385.84;
                    } else if (width >= 901 && width <= 1125) {
                        price = 424.53;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 453.09;
                    }
                } else if (height >= 1750 && height <= 2050) {
                    if (width >= 500 && width <= 640) {
                        price = 304.26;
                    } else if (width >= 641 && width <= 800) {
                        price = 329.62;
                    } else if (width >= 801 && width <= 900) {
                        price = 340.64;
                    } else if (width >= 901 && width <= 1000) {
                        price = 351.67;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 363.79;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 374.82;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 411.20;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 500 && width <= 640) {
                        price = 313.08;
                    } else if (width >= 641 && width <= 800) {
                        price = 335.13;
                    } else if (width >= 801 && width <= 900) {
                        price = 350.56;
                    } else if (width >= 901 && width <= 1000) {
                        price = 359.38;
                    } else if (width >= 1001 && width <= 1100) {
                        price = 385.84;
                    } else if (width >= 1101 && width <= 1200) {
                        price = 394.66;
                    } else if (width >= 1201 && width <= 1340) {
                        price = 428.83;
                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 500 && width <= 900) {
                        price = 385.84;
                    } else if (width >= 901 && width <= 1125) {
                        price = 424.53;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 453.09;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 500 && width <= 900) {
                        price = 395.76;
                    } else if (width >= 901 && width <= 1125) {
                        price = 434.35;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 474.03;
                    }
                } else if (height >= 2501 && height <= 2670) {
                    if (width >= 500 && width <= 900) {
                        price = 417.81;
                    } else if (width >= 901 && width <= 1125) {
                        price = 461.91;
                    } else if (width >= 1126 && width <= 1340) {
                        price = 518.13;
                    }
                }
                break;
            case "prom2" :
                if (height == 2000 ) {
                    if (width == 1150) {
                        price = 507.08;
                    } else if (width == 1200) {
                        price = 509.25;
                    } else if (width == 1250) {
                        price = 514.65;
                    } else if (width == 1300) {
                        price = 518.98;
                    } else if (width == 1350) {
                        price = 524.38;
                    } else if (width == 1400) {
                        price = 528.71;
                    } else if (width == 1450) {
                        price = 530.87;
                    } else if (width == 1600) {
                        price = 549.25;
                    } else if (width == 1700) {
                        price = 551.41;
                    } else if (width == 1800) {
                        price = 558.98;
                    } else if (width == 1900) {
                        price = 567.63;
                    } else if (width == 2000) {
                        price = 582.77;
                    } else if (width >= 850 && width <= 1280) {
                        price = 509.25;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 517.89;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 527.63;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 551.41;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 563.31;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 588.17;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 670.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 690.89;
                    } else if (width >= 2401 && width <= 2600) {
                        price = 759.00;
                    }else if(width>=2601 && width <=2660){
                        price = 779.55;
                    }

                }else if (height == 2050 ) {
                    if (width == 1150) {
                        price = 508.16;
                    } else if (width == 1200) {
                        price = 510.33;
                    } else if (width == 1250) {
                        price = 516.31;
                    } else if (width == 1300) {
                        price = 518.98;
                    } else if (width == 1350) {
                        price = 527.63;
                    } else if (width == 1400) {
                        price = 529.79 ;
                    } else if (width == 1450) {
                        price = 531.95;
                    } else if (width == 1600) {
                        price = 549.25;
                    } else if (width == 1700) {
                        price = 553.57;
                    } else if (width == 1800) {
                        price = 563.31;
                    } else if (width == 1900) {
                        price = 568.71;
                    } else if (width == 2000) {
                        price = 584.93;
                    } else if (width >= 850 && width <= 1280) {
                        price = 512.49;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 522.22;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 529.79;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 552.49;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 566.55;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 588.17;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 670.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 690.89;
                    } else if (width >= 2401 && width <= 2600) {
                        price = 759.00;
                    }else if(width>=2601 && width <=2660){
                        price = 779.55;
                    }

                }
                else if (height == 2100) {
                    if (width == 1150) {
                        price = 540.60;
                    } else if (width == 1200) {
                        price = 542.76;
                    } else if (width == 1250) {
                        price = 551.41;
                    } else if (width == 1300) {
                        price = 549.25;
                    } else if (width == 1350) {
                        price = 560.06;
                    } else if (width == 1400) {
                        price = 560.06;
                    } else if (width == 1450) {
                        price = 568.71;
                    } else if (width == 1600) {
                        price = 581.69;
                    } else if (width == 1700) {
                        price = 589.25;
                    } else if (width == 1800) {
                        price = 600.07;
                    } else if (width == 1900) {
                        price = 606.55;
                    } else if (width == 2000) {
                        price = 617.37;
                    } else if (width >= 850 && width <= 1260) {
                        price = 562.22;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 563.31;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 579.52 ;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 587.09;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 588.17;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 601.15;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 609.80;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 614.12;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 634.66;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 657.37;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 699.54;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 714.67;
                    } else if (width >= 2401 && width <= 2600) {
                        price = 787.11;
                    }else if(width >= 2601 && width <= 2660){
                        price = 810.90;
                    }

                } else if (height == 2150) {
                    if (width == 1150) {
                        price = 517.89;
                    } else if (width == 1200) {
                        price = 518.98;
                    } else if (width == 1250) {
                        price = 527.63;
                    } else if (width == 1300) {
                        price = 527.63;
                    } else if (width == 1350) {
                        price = 535.19;
                    } else if (width == 1400) {
                        price = 538.44;
                    } else if (width == 1450) {
                        price = 544.92;
                    } else if (width == 1600) {
                        price = 554.66;
                    } else if (width == 1700) {
                        price = 563.31;
                    } else if (width == 1800) {
                        price = 577.36;
                    } else if (width == 1900) {
                        price = 584.93;
                    } else if (width == 2000) {
                        price = 595.74;
                    } else if (width >= 850 && width <= 1280) {
                        price = 521.14;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 527.63;
                    } else if (width >= 1381 && width <= 1480) {
                        price = 541.68;
                    } else if (width >= 1481 && width <= 1600) {
                        price = 563.31;
                    } else if (width >= 1601 && width <= 1800) {
                        price = 584.93;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 605.47;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 670.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 690.89;
                    } else if (width >= 2401 && width <= 2600) {
                        price = 759.00;
                    }else if(width >= 2601 && width <= 2660){
                        price = 779.55 ;
                    }

                } else if (height == 2200) {
                    if (width == 1150) {
                        price = 584.93;
                    } else if (width == 1200) {
                        price = 587.09;
                    } else if (width == 1250) {
                        price = 591.42;
                    } else if (width == 1300) {
                        price = 593.58;
                    } else if (width == 1350) {
                        price = 605.47;
                    } else if (width == 1400) {
                        price = 608.72;
                    } else if (width == 1450) {
                        price = 611.96;
                    } else if (width == 1600) {
                        price = 603.31;
                    } else if (width == 1700) {
                        price = 608.72;
                    } else if (width == 1800) {
                        price = 624.93;
                    } else if (width == 1900) {
                        price = 635.75;
                    } else if (width == 2000) {
                        price = 647.64;
                    } else if (width >= 850 && width <= 1100) {
                        price = 623.85;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 634.66;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 699.54;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 773.06;
                    } else if (width >= 2251 && width <= 2660) {
                        price = 839.01;
                    }

                } else if (height >= 1750 && height <= 2050) {
                    if (width >= 850 && width <= 1260) {
                        price = 549.25;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 550.33;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 558.98;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 566.55;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 576.28;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 583.85;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 590.34;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 594.66;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 617.37;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 637.91;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 670.34;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 690.89;
                    } else if (width >= 2401 && width <= 2600) {
                        price = 759.00;
                    }else if(width >= 2601 && width <= 2660){
                        price = 779.55;
                    }
                } else if (height >= 2051 && height <= 2150) {
                    if (width >= 850 && width <= 1260) {
                        price = 562.22;
                    } else if (width >= 1261 && width <= 1280) {
                        price = 563.31;
                    } else if (width >= 1281 && width <= 1380) {
                        price = 579.52;
                    } else if (width >= 1381 && width <= 1430) {
                        price = 587.09;
                    } else if (width >= 1431 && width <= 1480) {
                        price = 588.17;
                    } else if (width >= 1481 && width <= 1530) {
                        price = 601.15;
                    } else if (width >= 1531 && width <= 1600) {
                        price = 609.80;
                    } else if (width >= 1601 && width <= 1630) {
                        price = 614.12;
                    } else if (width >= 1631 && width <= 1800) {
                        price = 634.66;
                    } else if (width >= 1801 && width <= 2000) {
                        price = 657.37;
                    } else if (width >= 2001 && width <= 2200) {
                        price = 699.54;
                    } else if (width >= 2201 && width <= 2400) {
                        price = 714.67;
                    } else if (width >= 2401 && width <= 2600) {
                        price = 787.11;
                    }else if(width >= 2601 && width <= 2660){
                        price = 810.90 ;

                    }
                } else if (height >= 2151 && height <= 2300) {
                    if (width >= 850 && width <= 1100) {
                        price = 623.85;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 634.66;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 699.54;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 773.06;
                    } else if (width >= 2251 && width <= 2660) {
                        price = 839.01;
                    }
                } else if (height >= 2301 && height <= 2500) {
                    if (width >= 850 && width <= 1100) {
                        price = 640.07;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 654.13;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 717.92;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 792.52;
                    } else if (width >= 2251 && width <= 2660) {
                        price = 857.39;
                    }
                } else if (height >= 2501 && height <= 2670) {
                    if (width >= 850 && width <= 1100) {
                        price = 672.51;
                    } else if (width >= 1101 && width <= 1340) {
                        price = 696.29;
                    } else if (width >= 1341 && width <= 1800) {
                        price = 753.60;
                    } else if (width >= 1801 && width <= 2250) {
                        price = 866.04;
                    } else if (width >= 2251 && width <= 2540) {
                        price = 952.54;
                    }
                }
                break;
        }
        return price * 1.025;
    }
}
