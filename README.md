# cell-info-2-json

## 📦Description

This project is a Maven project that has the ability to return Excel cell information in JsonArray format String.

## 💬Usage

Just add the code below to your maven dependencies:

```xml
<dependency>
    <groupId>io.github.no-dumps</groupId>
    <artifactId>cell-info-2-json</artifactId>
    <version>1.0</version>
</dependency>
```

Write Program:

```java
import nodump.noouchi.CellInfo2Json;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        String cellInfo = CellInfo2Json.getCellInfo("excelPath");
    }
}
```

<details>
  <summary>View Sample String CellInfo2Json.getCellInfo()</summary>

```json
[
  {
    "SheetName": "シート1",
    "CellInfo": [
      {
        "cellRange": "A1",
        "value": "テスト",
        "alignment": "GENERAL",
        "borderBottom": "THIN",
        "borderLeft": "THIN",
        "borderRight": "THIN",
        "borderTop": "THIN",
        "bottomBorderColor": "0",
        "leftBorderColor": "0",
        "rightBorderColor": "0",
        "topBorderColor": "0",
        "dataFormat": "General",
        "fillBackgroundColor": null,
        "fillForegroundColor": null,
        "fillPattern": "NO_FILL",
        "font": {
          "bold": "false",
          "charSet": "0",
          "xssfColor": null,
          "themeColor": "0",
          "fontHeight": "220",
          "fontHeightInPoints": "11",
          "fontName": "Calibri",
          "italic": "false",
          "strikeout": "false",
          "typeOffset": "0",
          "underline": "0"
        },
        "hidden": "false",
        "indention": "0",
        "locked": "true",
        "rotation": "0",
        "verticalAlignment": "BOTTOM"
      },
      {
        "cellRange": "B1",
        "value": "サンプル",
        "alignment": "GENERAL",
        "borderBottom": "NONE",
        "borderLeft": "NONE",
        "borderRight": "NONE",
        "borderTop": "NONE",
        "bottomBorderColor": "8",
        "leftBorderColor": "8",
        "rightBorderColor": "8",
        "topBorderColor": "8",
        "dataFormat": "General",
        "fillBackgroundColor": "[-1, -1, 0]",
        "fillForegroundColor": "[-1, -1, 0]",
        "fillPattern": "SOLID_FOREGROUND",
        "font": {
          "bold": "false",
          "charSet": "0",
          "xssfColor": null,
          "themeColor": "0",
          "fontHeight": "220",
          "fontHeightInPoints": "11",
          "fontName": "Calibri",
          "italic": "false",
          "strikeout": "false",
          "typeOffset": "0",
          "underline": "0"
        },
        "hidden": "false",
        "indention": "0",
        "locked": "true",
        "rotation": "0",
        "verticalAlignment": "BOTTOM"
      },
      {
        "cellRange": "A2",
        "value": "Excel",
        "alignment": "GENERAL",
        "borderBottom": "NONE",
        "borderLeft": "NONE",
        "borderRight": "NONE",
        "borderTop": "NONE",
        "bottomBorderColor": "8",
        "leftBorderColor": "8",
        "rightBorderColor": "8",
        "topBorderColor": "8",
        "dataFormat": "General",
        "fillBackgroundColor": null,
        "fillForegroundColor": null,
        "fillPattern": "NO_FILL",
        "font": {
          "bold": "false",
          "charSet": "0",
          "xssfColor": "[0, 0, 0]",
          "themeColor": "1",
          "fontHeight": "220",
          "fontHeightInPoints": "11",
          "fontName": "Arial",
          "italic": "false",
          "strikeout": "false",
          "typeOffset": "0",
          "underline": "0"
        },
        "hidden": "false",
        "indention": "0",
        "locked": "true",
        "rotation": "0",
        "verticalAlignment": "BOTTOM"
      },
      {
        "cellRange": "B3",
        "value": "",
        "alignment": "GENERAL",
        "borderBottom": "NONE",
        "borderLeft": "NONE",
        "borderRight": "NONE",
        "borderTop": "NONE",
        "bottomBorderColor": "8",
        "leftBorderColor": "8",
        "rightBorderColor": "8",
        "topBorderColor": "8",
        "dataFormat": "m/d/yy",
        "fillBackgroundColor": null,
        "fillForegroundColor": null,
        "fillPattern": "NO_FILL",
        "font": {
          "bold": "false",
          "charSet": "0",
          "xssfColor": null,
          "themeColor": "0",
          "fontHeight": "220",
          "fontHeightInPoints": "11",
          "fontName": "Calibri",
          "italic": "false",
          "strikeout": "false",
          "typeOffset": "0",
          "underline": "0"
        },
        "hidden": "false",
        "indention": "0",
        "locked": "true",
        "rotation": "0",
        "verticalAlignment": "BOTTOM"
      }
    ]
  }
]
```

</details>

## 🎫 License

- [MIT](https://raw.githubusercontent.com/no-dumps/cell-info-2-json/main/LICENSE?token=AK3GOOWLWOHCLX7RATE5HWTASM3R6)

## 👀Author

- [Profile](https://naokioouchi.github.io/ooooouchi/)
- [GitHub](https://github.com/NaokiOouchi)
- [Twitter](https://twitter.com/NaoNoaNaoNoaN)