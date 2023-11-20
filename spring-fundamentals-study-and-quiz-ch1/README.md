# Spring Fundamentals Self-Study and Quiz

## Chapter 1

本章節將練習使用 Spring Bean與依賴注入

最終目標，執行`Main`類別的`main()`，使其執行成功且符合預期。

- 新增數個動物類別，以實作`LandAnimal`與`SeaAnimal`介面並用於後續注入ZooManager類別的集合中。
- 實例部份不可以用new，而是使用Spring提供的DI方案。
- DI部份建議以`annotaion`完成。
- `ZooManager`以非單例的方式註冊到spring container，其實皆使用預設單例。
- 提示：除了實作介面的動物類別外，其餘類別僅需加入正確的`annotaion`即可。