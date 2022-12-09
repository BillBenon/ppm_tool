describe("Book registration", ()=>{

    it("loads book register form page", ()=>{
        cy.visit("http://127.0.0.1:5173/bookRegister");
        cy.get('[data-cy="submit"]').click();
    });
    it("should redirect to a success page after filling the form and clicking submit", ()=>{
        cy.get("#title").type("After we fell");
        cy.get("#author").type("Anna Todd");
        cy.get("#ispn").type("1234565432");
        cy.get("#publishers").type("After Collection");
        cy.get(".submit-btn").click();
    })

})