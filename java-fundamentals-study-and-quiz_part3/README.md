# Java Fundamentals Self-Study and Quiz Part3

## Chapter 1

本章節將練習使用 Collection

其中包含案例如下：

- Quiz1_1: 練習 List 常用函式
- Quiz1_2: 練習 Set 常用函式
- Quiz1_3: 練習 Map 常用函式
- Quiz1_4: 練習 Object Method override 時機與修改方式
  - 修改 `Person` 類別，通過測試

**Action:**

請完成 `Quiz1_x` 類別，使其對應的測試類別 `Quiz1_xTest` 通過所有測試。

※ 不可使用 Stream 方式完成

---

## Chapter 2

本章節將練習使用 Stream 與 Lambda

其中包含案例如下：

- Quiz2_1: 練習常用函式
- Quiz2_2: 練習需要使用 Lambda 的常用函式
- Quiz2_3: 練習如何使用 Stream 轉換資料
- Quiz2_4: 綜合練習
  - `wordCounts()`: 列出文章中的單字總數
  - `wordCounts(word)`: 列出文章中的特定單字總數，不區分大小寫
  - `getTopNLongerWords(n)`: 取得文章中長度排名前 n 名的單字清單，不區分大小寫

※ 使用 Stream 完成上述未完成函式，使其通過測試
  
**Action:**

請完成 `Quiz2_x` 類別，使其對應的測試類別 `Quiz2_xTest` 通過所有測試。

---

## Chapter 3

本章節將練習使用 Thread

其中包含案例如下：

- Quiz3_1: 練習建立 Thread (執行緒) 並且執行
  - `printFromThreadByExtend()`: 使用 `PrinterA` 類別繼承 Thread 類別並執行，使其通過測試
  - `printFromThreadByImplement()`: 使用 `PrinterB` 類別實作 Runnable 介面並執行，使其通過測試
- Quiz3_2: 練習暫停 Thread
  - `happyNewYear()`: 印出新年倒數計時，練習使用 `sleep()` 函式在每次輸出文字時暫停 1 秒鐘
    - 倒數第 3 秒時畫面顯示 `3...`
    - 倒數第 2 秒時畫面顯示 `3...2...`
    - 倒數第 1 秒時畫面顯示 `3...2...1...`
    - 倒數結束時畫面顯示 `3...2...1...Happy New Year!`
  - `eatHamburger()`: 練習使用 `join()` 函式，讓 Tom 不要吃空氣漢堡
- Quiz3_3: 練習 Thread 資料共用 (無測試案例)
  - `temperatureControl()`: 調整冷氣設定溫度，並查看溫度計印出現在幾度
    - 溫度計初始溫度為 28 度
    - 每 5 秒隨機設定一次冷氣溫度 (20~30)
    - 溫度計每秒調節溫度，每次 1 度，與冷氣設定溫度相比做調整
    - 範例
      - 初始查看溫度計顯示為 `28`，冷氣設定溫度 `25`
      - 每秒查看溫度計顯示為 `27` `26` `25` `25` `25`
      - 5 秒後，冷氣設定溫度 `30`
      - 每秒查看溫度計顯示為 `26` `27` `28` `29` `30`
  - `grabMarbles`: 魷魚遊戲的 101 號與 278 號在打彈珠時，兩造同意改用搶彈珠的形式決勝，取得數量最高的人就可以贏得遊戲
    - 建立兩個執行緒分別代表參賽者，在彈珠數量用光前，盡力的搶彈珠，每次只能搶 1 顆
    - 印出 **個別搶到的彈珠數量** 與 **兩人加總的彈珠數量**，請確保他們合計不會取得超過 20000 顆彈珠，不然就會被主辦單位淘汰
    - HINT: 使用 `java.util.concurrent.atomic` 內的 class 做數值運算
- Quiz3_4: 綜合練習 (無測試案例)
  - `horseRace()`
    - 讓使用者可以自行定義參與賽馬的數量。
    - 改寫範例程式，建立不同賽馬進行賽跑，一旦有賽馬跑到終點，顯示結果(一場比賽僅能有一個優勝者)。
    - 每個賽馬會有不同的速度，或者隱藏屬性(?)幫助牠更快到達終點
    - 使用 `setHorsePosition()` 設定賽馬位置 (0~100)，使用 `setMessage()` 顯示最終贏家

**Action**

請完成 `Quiz3_x` 類別，使其對應的測試類別 `Quiz3_xTest` 通過所有測試。

---

## Chapter 4

本章節將練習使用JDBC對資料庫進行簡單的CRUD操作

其中需完成以下內容：

- 在本機安裝postgresql
  - https://www.enterprisedb.com/postgresql-tutorial-resources-training?cid=924
- 建立後續例題需使用的任務清單table
  - 取名為task_table
  - 欄位包含task_seq設為PK，並會自動產生序號。
  - 欄位包含task_name，用於儲存任務名且不可為空。
  - 欄位包含description，用於儲存任務說明。
- postgre driver需於MAVEN設定依賴。
- 完成CRUD各功能，資料內容、實作方式不拘。
- 基於上述完成的內容，寫出合理的test case以說明程式的正確性。

**Action**

請於 `Quiz4` 類別完成CRUD各功能實作，並於`Quiz4Test` 類別實作測試，在達成`功能完整`且`測試邏輯合理`的情況下，method名稱、參數、回傳值皆不拘。
