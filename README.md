# small-java-MVC-application
this sample show how to create a small java MVC web application


MVC is Model+View+Controller design pattern,which is components of a completed web application
MVC 就是把业务逻辑从servlet中抽离出来，把它放在一个“模型”中，是一个可重用的普通java类。模型是业务数据和方法（处理该数据的规则）的组合。
Model:实际的业务逻辑和状态放在模型中。例如：购物车的内容（和处理购物车的规则）就是MVC中的model,系统中只有这部分与数据库通信。
Controller:从请求获得用户输入，并明确这些输入对模型有什么影响，告诉模型自行更新，并且要让视图能得到新的模型状态。
View:负责表示。它从控制器得到模型的状态(not directly),另外，视图还要获得用户输入，交给控制器










