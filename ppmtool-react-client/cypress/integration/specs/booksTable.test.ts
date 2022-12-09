describe("Books table should have all this", ()=>{
beforeEach("load page that displays books", ()=>{
    cy.visit("http://127.0.0.1:5173/books");

})
    it("Check number of rows and columns", ()=>{
        cy.get("table[className='table']>tbody>tr").should('have.length', '4');
    })

})