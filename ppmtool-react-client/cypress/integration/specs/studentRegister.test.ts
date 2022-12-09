describe("Register a student", ()=>{


    it("loads student register form", ()=>{
        cy.visit("http://127.0.0.1:5173/register");
        cy.get('[data-cy="submit"]').click();
    });
    it("should redirect to a success page after filling the form and clicking submit", ()=>{
        cy.get("#firstname").type("Kanjye");
        cy.get("#lastname").type("Keza");
        cy.get("#email").type("keza@gmail.com");
        cy.get(".submit-btn").click();
    })
})