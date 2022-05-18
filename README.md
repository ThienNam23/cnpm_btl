# Một số lưu ý trước khi chạy project
- Sử dụng hệ điều hành Windows để code và run cho đồng bộ với nhóm
- Cài đặt `PostgreSQL (pgsql)` lúc hỏi mật khẩu root thì nhớ lấy, tốt nhất là đặt cho nó dễ nhớ vì chạy trên máy local thì đặt khó làm gì (mình đặt trùng với username luôn, là `postgres`)
- Sử dụng IntelliJ IDEA, VSCode, Netbeans ... để code & run (theo mức độ ưu tiên giảm dần từ trái sang phải, lí do là code nó oke và có lỗi gì thì những bạn khác có thể dễ dàng hỗ trợ hơn)

# Hướng dẫn chạy project
Sau khi clone project về thì thực hiện lần lượt theo các bước
1. Tạo `role` với `database` để Spring kết nối tới
    - Cách 1: (cách này nhanh hơn nhiều)
      - Truy cập vào thư mục cài đặt của `pgsql` sau đó mở lên với CMD
      - Nhập lệnh: `psql -U postgres (copy)`
      - Nhập mật khẩu root (mật khẩu khi cài đặt nó hỏi ý), lưu ý là cứ thế nhập rồi ấn Enter thôi nó k hiển thị lên màn hình đâu
      - Lần lượt nhập 2 lệnh bên dưới để tạo role (account) và database
      - `create role cnpm_gr5 with encrypted password 'cnpm_gr5' login;`
      - `create database cnpm_gr5 with owner cnpm_gr5;`
      - Xong bước 1
    - Cách 2: Sử dụng pgadmin4 (công cụ GUI cho `pgsql`)
      - Hỏi Nam chứ dài lắm k viết được :v
2. Chạy project
    - Sau khi chạy được project, terminal sẽ hiện 
   ```
    App started at: http://localhost:8080
    Go to http://localhost:8080/init to create roles and admin's account for first time
   ```
    - Vào link `http://localhost:8080/init` để khởi tạo roles và tài khoản admin cho hệ thống security
    - Xong, tiếp tục code như bình thường :3
