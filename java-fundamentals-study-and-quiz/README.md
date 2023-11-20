# Java Fundamentals Self-Study and Quiz Part1

## Installation

- 安裝 `JDK 1.8` 最新版 -> [Link](https://www.oracle.com/tw/java/technologies/javase/javase-jdk8-downloads.html)
- 安裝 `IntelliJ Community` -> [Line](https://www.jetbrains.com/idea/download/)
- `Git` 工具安裝
  - [Git](https://git-scm.com/downloads)
  - [TortoiseGit](https://tortoisegit.org/download/) or [SourceTree](https://www.sourcetreeapp.com/)
- 下載程式碼
  - Fork
  - `Git Clone`
- 開啟專案，IntelliJ -> File -> Open

-----

## Abstract

- Chapter 1 : 資料型別、轉換與計算
- Chapter 2 : 字串處理
- Chapter 3 : 流程控制
- Chapter 4 : 綜合練習

-----

## Chapter 1 

### Section 1

本章節將練習使用 數字 型別進行 `運算` 及 `轉換` 

其中包含 5 個案例，如下：

- Case 1: 整數相加
- Case 2: 整數相乘
- Case 3: A 除以 B
- Case 4: 整數 A 減 B
- Case 5: 浮點數 A 減 B

**Action:**

請完成 `Quiz1_1` 類別，使其對應的測試類別 `Quiz1_1Test` 通過所有測試。

### Section 2

本章節將練習 `數字類別` 及 `字串` 之間的轉換

其中包含 6 個案例，如下：


- Case 1: 整數 轉成 浮點數
- Case 2: 浮點數 轉成 整數
- Case 3: 浮點數 四捨五入成 整數
- Case 4: 數字 轉成 字串
- Case 5: 字串 轉成 整數，如無法轉換，則回傳 0
- Case 6: 字串 轉成 浮點數，如無法轉換，則回傳 0.0

**Action:**

請完成 `Quiz1_2` 類別，使其對應的測試類別 `Quiz1_2Test` 通過所有測試。

-----

## Chapter 2

### Section 1

基本字串處理

- Case 1: 字串切割
  - If cutIndex < 0, 回傳原字串
  - If cutIndex >= 字串長度, 回傳 null
- Case 2: 字串合併
- Case 3: 字串替換
- Case 4: 首字母轉大寫

**Action:**

請完成 `Quiz2_1` 類別，使其對應的測試類別 `Quiz2_1Test` 通過所有測試。

### Section 2

數字 及 時間 格式化轉換

- Case 1: 將 數字 轉換為 貨幣字串
  - 12345 -> $12,345.00
  - -12345 -> ($12,345.00)
- Case 2: 將 貨幣字串 轉換為 數字 
  - $12,345.00 -> 12345
  - ($12,345.00) -> -12345
- Case 3: 將 時間戳記 轉換為 時間字串， 時間字串格式為：2021/01/01 12:00:00 AM
- Case 4: 將 時間字串 轉換為 時間戳記， 時間字串格式為：2021/01/01 12:00:00 AM

**Action:**

請完成 `Quiz2_2` 類別，使其對應的測試類別 `Quiz2_2Test` 通過所有測試。


### Section 3

小練習

- Case 1: 字串輪轉，將字串輪轉 n 個次，每輪轉一次，將會把最前面的字元，搬到最後面，例如：
  - 字串 `12345` ，輪轉 2 次，則變為 `34512`
  - 字串 `12345` ，輪轉 5 次，則變為 `12345`

**Action:**

請完成 `Quiz2_3` 類別，使其對應的測試類別 `Quiz2_3Test` 通過所有測試。

-----

## Chapter 3

### Section 1

練習條件判斷及迴圈

- Case 1: 包括號，將一個字串的左側及右側，附加 n 個小括號，例如:
  - input: hello, n: 2, 結果應為: ((hello))
- Case 2: 輸入整數陣列，篩選偶數加總，例如:
  - input: [1, 2, 3, 4, 5], 結果應為: 6

**Action:**

請完成 `Quiz3_1` 類別，使其對應的測試類別 `Quiz3_1Test` 通過所有測試。

### Section 2

練習遞迴

- Case 1: 階乘運算，輸入一個整數 n，回傳 n 階乘計算結果，例如:
  - input: 5, result: 120

**Action:**

請完成 `Quiz3_2` 類別，使其對應的測試類別 `Quiz3_2Test` 通過所有測試。


### Section 3

小練習

- Case 1: 列出質數，輸入一個整數 n，回傳小於等於 n 的全部質數，例如:
  - input: 13. result: [2, 3, 5, 7, 13]

**Action:**

請完成 `Quiz3_3` 類別，使其對應的測試類別 `Quiz3_3Test` 通過所有測試。


-----

## Chapter 4

綜合練習

### Section 1

**四則運算**

- 輸入一個四則運算式，包含大中小括號，例如:
  - {1 + [2 * (3 - 1) / (1 + 1)]} / 2
- 輸出計算結果
  - 若公式無法解析，則回傳 0 (例如括號有錯)

**Action:**

請完成 `Quiz4_1` 類別，使其對應的測試類別 `Quiz4_1Test` 通過所有測試。

### Section 2

**羅馬數字轉換**

羅馬數字說明

羅馬數字分別有七個字母，分別代表:

|Symbol    |   Value |
|----------|---------|
|I        |     1     |
|V        |     5|
|X        |     10|
|L        |     50|
|C        |     100|
|D        |     500|
|M        |     1000|

其規則請參考 [此連結](https://zh.wikipedia.org/wiki/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97)

- Case 1: 羅馬轉數字
- Case 2: 數字轉羅馬

**Action:**

請完成 `Quiz4_2` 類別，使其對應的測試類別 `Quiz4_2Test` 通過所有測試。

-----

