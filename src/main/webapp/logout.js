document.addEventListener("DOMContentLoaded", () => {

    const h1=document.querySelector("h1");
    const logout = document.createElement("a");
    logout.href="login.jsp";
    logout.textContent="logout";
    h1.insertAdjacentElement("afterend", logout);
})
