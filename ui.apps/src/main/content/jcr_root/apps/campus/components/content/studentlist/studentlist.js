use(function () {
    var items = [];
    var root = currentPage;
    var it = currentPage.listChildren();

    while (it.hasNext()) {
        var student = it.next();
        items.push(student);
    }

    return {
        items: items,
        root : root.getName()
    };
});