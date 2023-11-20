# Java Fundamentals Self-Study and Quiz Part2

## Chapter 0

[Java Collection Exercises - w3resource](https://www.w3resource.com/java-exercises/collection/index.php)

**Action:**

閱讀以上網址，認識 Collection 常用函式

## Chapter 1
[Get specific files by extensions from a specified folder](https://www.w3resource.com/java-exercises/io/java-io-exercise-2.php)

**Action:**

改寫以上程式碼為物件導向

-----

## Chapter 2

[Read a file content line by line](https://www.w3resource.com/java-exercises/io/java-io-exercise-11.php)

**Action:**

利用 Chapter 1 程式，讀取資料夾下特定副檔名的檔案內容並顯示結果 (視情況改寫 Chapter 1 程式)

-----

## Chapter 3

[Java Create and Write To Files](https://www.w3schools.com/java/java_files_create.asp)

**Action:**

延續 Chapter 2，將讀取回來的檔案另存為編碼 utf-8 的文件 (視情況改寫 Chapter 1 程式)

-----

## Chapter 4

**動物園看表演**

提供輸入介面與使用者互動 (例如: `Scanner`) ，讓使用者回答以下問題，並且顯示輸出結果

使用者回答問題

1. 指定查看的表演場域 (陸、海、空)
2. 指定查看的動物 (若有被指定查看的動物會作為壓軸最後登場，如果沒有就隨機選取)
3. 動物需存在同物種但有多隻的情況，如：動物園同時存在團團、圓圓兩隻熊貓。
4. 指定有多少動物會表演 (至少要有一隻)

輸出結果

1. 動物表演行為

**範例**

```
1. Choose the place (1: Land, 2: Sea, 3: Air): 1
These are the animals in Land
  1. Panda
  2. Pangolin
  3. Dodo
2. Choose the target animal (if not, input 0, it will random): 3
3. How many animals will show: 3

Alright, that's all.
It is show time!

Panda: eat bamboo
PangoLin: sleep
Dodo: stare blankly
```

**Action:**

- 使用物件導向完成此題目 
- 使用介面區分不同場域，動物表演時會依照不同場域呼叫不同介面的表演函式 
  - 例如陸地場域的動物都會 `run()`, 海洋生物的動物都會 `swim()`，地面與海洋的兩棲動物則是會 `run()` 以及 `swim()`

> 其他非功能性需求
> - 採用 SOLID 原則