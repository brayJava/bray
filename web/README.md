### 医院相关

#### 查询医院

- URI: /api/doctor/hospital
- 发送数据
 ```json
  {
    "text": "检索名称 如果为空返回最前边20个"
  }
 ```
- 返回数据（最多返回20）
    ```json
    {
      "id": "编码",
      "name": "医院名称",
      "country":"国家",
      "province":"省",
      "city":"市",    
      "address":"地址"
    }
    ```
 
 
  #### 添加医院
  - URI: /api/doctor/hospital-add
  - 发送数据
  ```json
    {
      "text": "医院名称",
      "province":"省",
      "city":"市",
      "address":"广州市中山二路58号"
    }
  ```
  - 返回数据
  ```json
    {
     "id": "编号"
    }
  ```  