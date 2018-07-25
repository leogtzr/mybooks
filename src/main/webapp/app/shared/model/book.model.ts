export interface IBook {
  id?: number;
  name?: string;
  author?: string;
  notes?: string;
}

export const defaultValue: Readonly<IBook> = {};
